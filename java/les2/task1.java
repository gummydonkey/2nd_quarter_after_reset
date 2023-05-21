package les2;

import java.io.*;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
   
    public static void main(String[] args) {
        String jsonObject = getJsonString();
        String result = parseJSON(jsonObject);
        System.out.println(result);
        saveToFile(result);
    }


    static String getJsonString() {
        String path = "book.json"; 
        Logger logger = Logger.getAnonymousLogger();

        FileHandler logHandler = null;
        try {
            logHandler = new FileHandler("task01.log");
            logger.addHandler(logHandler);
        } 
        catch (IOException exception) {
            exception.printStackTrace();
        }

        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(path);
             Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
            }
            logger.log(Level.INFO, "Файл считан");
        } catch (FileNotFoundException exception) {
            logger.log(Level.WARNING, String.format("FileReader: %s", exception));
        } catch (IOException exception) {
            logger.log(Level.WARNING, String.format("Scanner: %s", exception));
        }
        logHandler.close();
        return stringBuilder.toString();
    }

    static String parseJSON(String json) {
        String[] template = new String[]{"- Студент ", " получил ", " по предмету ", ".\n"};
        int templateIndex = 0;
        StringBuilder resultString = new StringBuilder();
        Pattern valuePattern = Pattern.compile(":\".+?[,}]");
        Matcher valueMatcher = valuePattern.matcher(json);
        while (valueMatcher.find()) {
            resultString.append(template[templateIndex++]);
            resultString.append(json.subSequence(valueMatcher.start() + 2, valueMatcher.end() - 2));
            if (templateIndex == template.length - 1) {
                resultString.append(template[templateIndex]);
                templateIndex = 0;
            }
        }
        return resultString.toString();
    }


    static void saveToFile(String source) {
        String path = "output.txt";
        Logger logger = Logger.getAnonymousLogger();
        FileHandler logHandler = null;
        try {
            logHandler = new FileHandler("task1.log");
            logger.addHandler(logHandler);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try (FileWriter newDump = new FileWriter(path, true)) {
            newDump.append(source);
            newDump.append("\n");
            newDump.flush();
            logger.log(Level.INFO, "Файл успешно дописан.");
        } catch (IOException exception) {
            logger.log(Level.WARNING, exception.toString());
        }

        logHandler.close();
    }
}