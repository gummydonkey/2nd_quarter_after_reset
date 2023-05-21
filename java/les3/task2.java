package les3;

import java.util.Collections;
import java.util.List;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
//среднее арифметическое из этого списка.

public class task2 {
    public static void main(String[] args) {
        List<Integer> randomList = task1.getRandIntList(10, 1, 10);
        int minValue = Collections.min(randomList);
        int maxValue = Collections.max(randomList);
        Double avgOfList = randomList.stream().mapToInt(Integer::intValue).average().getAsDouble();

        showOnScreen(randomList, minValue, maxValue, avgOfList);
    }


    private static void showOnScreen(List<Integer> randomList, int minValue, int maxValue, Double avgOfList) {
        StringBuilder resultOut = new StringBuilder();
        resultOut.append(String.format("Список: %s;\n", randomList));
        resultOut.append(String.format("Минимальное значение - %d;\n", minValue));
        resultOut.append(String.format("Максимальное значение - %d;\n", maxValue));
        resultOut.append(String.format("Средрнее арифметическое: %.2f", avgOfList));
        System.out.println(resultOut);
    }
}