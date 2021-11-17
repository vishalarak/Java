//Write a program to add,sub,multiply,divide,two numbers as per users choice (using switch)

import java.util.*;

class arithmatic
{
    public static void main(String[] args) 
    {
     System.out.println("Enter which operation you want to perform");
     String op;
     Scanner input = new Scanner(System.in);
     op = input.next().toLowerCase();
     switch (op) 
     {
        case "addition" :
        int ans = 0;
        int i;
        Scanner addInput = new Scanner (System.in);
        System.out.print("Enter number of elements you want to add : ");
        int n = addInput.nextInt();
        int a[] = new int [n];
        System.out.println("Enter elements you want to add");
        for (i = 0; i < n; i++) 
        {
          a[i] = addInput.nextInt();
        }
        for (i = 0; i < a.length; i++) 
        {
          ans = ans + a[i];
        }
        System.out.println("Addition is : " + ans);
        break;
        case "subtraction" :
        int ans1 = 0;
        int i1;
        Scanner subInput = new Scanner (System.in);
        System.out.print("Enter number of elements you want to subtract : ");
        int n1 = subInput.nextInt();
        int a1[] = new int [n1];
        System.out.println("Enter elements you want to subtract");
        for (i1 = 0; i1 < n1; i1++) 
        {
          a1[i1] = subInput.nextInt();
        }
        ans1 = a1[0];
        for (i1 = 0; i1 < a1.length - 1; i1++) 
        {
           ans1 = ans1 - a1[i1+1];
        }
        System.out.println("Subtraction is : " + ans1);
        break;
        case "multiplication" :
        System.out.print("How many numbers you want to multiply :");
        Scanner mulInput = new Scanner(System.in);
        int n2 = mulInput.nextInt();
        int a2[] = new int [n2];
        System.out.println("Enter elements you want to multiply");
        for (int i2 = 0; i2 < n2; i2++) 
        {
           a2[i2] = mulInput.nextInt();
        }
        int ans2 = 1;
        for (int i2 = 0; i2 < a2.length; i2++) 
        {
           ans2 = ans2 * a2[i2];
        }
        System.out.println("Multiplication = " + ans2);
        break;
         case "division" :
         int a3[] = new int [2];
         System.out.print("Enter 2 values you want to divide (num1/num2) : ");
         Scanner divInput = new Scanner(System.in);
         int number1 = divInput.nextInt();
         int number2 = divInput.nextInt();
         int ans3 = number1 / number2;
         System.out.println("Division = " + ans3);
        break;
        default :
         System.out.println("Enter a valid operation");
      }
  
    }
}