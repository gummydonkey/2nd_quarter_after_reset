package les4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
//“перевернутый” список. Постараться не обращаться к листу по индексам.


public class task1 {     
    public static void main(String[] args) {
        LinkedList<Integer> list = getFilledLinkedList(10, 0, 10);
        System.out.println(list);
        LinkedList<Integer> reversedList = getReversedLinkedList(list);
        System.out.println(reversedList);
    }

    static LinkedList<Integer> getFilledLinkedList(int size, int minValue, int maxValue) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt(minValue, maxValue + 1));
        }
        return linkedList;
    }

    static LinkedList<Integer> getReversedLinkedList(LinkedList<Integer> source) {
        ListIterator<Integer> listIterator = source.listIterator(source.size());
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();

        while (listIterator.hasPrevious()) {
            reversedLinkedList.add(listIterator.previous());
        }
        return reversedLinkedList;
    }
}