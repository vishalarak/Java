// Program for find the greater number 

import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);

        System.out.println("Enter the first number");
        int a = num.nextInt();

        System.out.println("Enter the second number");
        int b = num.nextInt();

        System.out.println("Enter the third number");
        int c = num.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("The grater number is "+ max);
    }
}
