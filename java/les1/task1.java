/**
 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 2) Вычислить n! (произведение чисел от 1 до n)
 3) Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и 
 на себя без остатка)
 4) Реализовать простой калькулятор (введите первое число, введите второе число, 
 введите требуемую операцию, ответ)
 5)*** Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть 
 заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение 
 до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */
package les1;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Sum(0);
        Mult(0);
        Simple(0);
    }
    static Integer Scan(){
        System.out.printf("Введите число n : ");
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            return n;
        }
    }

    //1) Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    static void Sum(int n){ 
        System.out.println("------------------- \n Сумма чисел от 1 до n");
        int num = Scan();
        int sum = 0; 
        //System.out.println(num + num); // проверка на тип int
        while (num > 0){
            sum += num;
            num -= 1;
        }
        System.out.println(">>> " + sum);
    }
 
    // 2) Вычислить n! (произведение чисел от 1 до n)
    static void Mult(int n){ 
        System.out.println("------------------- \n Произведение чисел от 1 до n");
        int sum = 1;
        int num = Scan();   
        //System.out.println(num + num); // проверка на тип int
        for(int i = 2; i <= num; i++){
            sum *= i;
        }
        System.out.println(">>> " + sum);
    }

    // 3) Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и 
    // на себя без остатка)
    static void Simple(int n){
        System.out.println("------------------- \n Простые числа он 1 до n");
        int num = Scan();

        for(int i = 2; i < num; i++){
            int count = 0;
            for(int j = 2; j <= i; j++){
                if(i % j == 0){
                    count ++;
                }
            }
            if(count < 2){
                System.out.printf("%s  ", i);
            }
        }
    }
}