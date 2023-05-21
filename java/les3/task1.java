package les3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class task1 {
    public static void main(String[] args) {
        List<Integer> randomList = getRandIntList(10, 0, 10);
        System.out.println(randomList);
        filterOutEven(randomList);
        System.out.println(randomList);
    }

    static List<Integer> getRandIntList(int length, int min, int max) {
        List<Integer> list = new ArrayList<>(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(min, max + 1));
        }
        return list;
    }

    static void filterOutEven(List<Integer> source) {
        source.removeIf(number -> number % 2 == 0);
    }
}