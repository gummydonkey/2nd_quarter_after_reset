package les4;

import java.util.LinkedList;
import java.util.ListIterator;


//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = task1.getFilledLinkedList(2, 0, 10);
        int sumOfElements = getSum(list);
        System.out.printf("%s => %d", list, sumOfElements);
    }


    static int getSum(LinkedList<Integer> source) {
        ListIterator<Integer> listIterator = source.listIterator();
        int sum = 0;

        while (listIterator.hasNext()) {
            sum += listIterator.next();
        }

        return sum;
    }
}