package les3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Заполнить список названиями планет Солнечной системы в 
//произвольном порядке с повторениями. Вывести
//название каждой планеты и количество его повторений в списке.

public class task3 {
    public static void main(String[] args) {
        String[] planets = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран",
                                        "Нептун", "Плутон", "Церера", "Хаумеа", "Макемаке", "Эрида"};
        List<String> mySequence = getPlanetsSequence(planets, 10);
        System.out.println(mySequence);
        String result = getFrequencyOfOccurrences(planets, mySequence);
        System.out.println(result);
    }

    static String getChoice(String[] sequence) {
        Random random = new Random();
        return sequence[random.nextInt(0, sequence.length)];
    }

    static List<String> getPlanetsSequence(String[] planets, int length) {
        List<String> list = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            list.add(getChoice(planets));
        }
        return list;
    }

    private static String getFrequencyOfOccurrences(String[] planets, List<String> mySequence) {
        StringBuilder result = new StringBuilder();
        long count;
        for (String planetName : planets) {
            count = mySequence.stream().filter(planetName::equals).count();
            if (0 < count) {
                result.append(String.format("%8s - %d\n", planetName, count));
            }
        }
        return result.toString();
    }
}