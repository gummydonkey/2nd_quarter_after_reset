package les1;

import java.util.Scanner;

public class calc {
    static int calc(int a, String x, int b){
        if(x.equals("+")) 
            return a + b;
        if(x.equals("-")) 
            return a - b;
        if(x.equals("*")) 
            return a * b;
        if(x.equals("/")) 
            return a / b;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scan.nextInt();

        System.out.print("Введите знак: ");
        String x = scan.next();

        System.out.print("Введите b: ");
        int b = scan.nextInt();

        System.out.printf("%d %s %d = %d", a, x, b, calc(a, x, b));
    }
}