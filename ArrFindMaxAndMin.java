//Find the maximum & minimum number in an array of integers.

import java.util.Scanner;

public class ArrFindMaxAndMin {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int size = input.nextInt();
    int [] arr = new int [size];

    for (int i = 0; i < size; i++) {
        arr[i] = input.nextInt();   
    }

    int max  = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
        
        if (arr[i] < min) {
            min = arr[i];
        }

        if (arr[i] > max) {
            max = arr[i];
        }
    }

    System.out.println("The largest number is " + max);
    System.out.println("The smallest number is " + min);
        
    }
      

}
