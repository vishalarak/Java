// Write a program to count and print numbers above your number from array.
import java.util.*;
public class ArrayTest 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter size of the array: ");
        int n = scan.nextInt();
    
        int numbers[] = new int[n];
    
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; ++i) 
        {
          numbers[i] = scan.nextInt();
        }

        System.out.print("Enter your number = ");
        int num = scan.nextInt();
        
        System.out.println("Numbers greater then given number = ");
        display(numbers, num);
    
        scan.close();
    }
    
      public static void display(int[] numbers, int num) 
      { 
          for (int i : numbers) 
           {
             if(i > num)
             System.out.print(i+" ");
           }
        
      }
}
