public class Loops {
    public static void main(String[] args) {
        // When you know how many time loop is going to run then use For loop 
        System.out.println("--For Loop--");
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        // When you dont know how many time loop is going to run then use while loop
        System.out.println("--While Loop--");
        System.out.println(" ");
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }

        // In do while, loop is going to run atleast once 
        System.out.println("--Do While Loop--");
        System.out.println(" ");
        int n = 2;
        do {
            System.out.println(n);
            n = n+2;
        } while (n <=20);
    }
}
