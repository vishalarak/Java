//Write a program to create an array print it in original and sorted

public class Array 
{
    public static void main(String[] args) 
    {
        int [] arr = new int [] {55, 22, 88, 77, 11};
        int temp = 0;
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) 
        {
          System.out.print("\n"+arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) 
        {
          for (int j = i+1; j < arr.length; j++) 
           {
                if(arr[i] > arr[j]) 
              {
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
               }
           }
        }
        System.out.println();
        System.out.println("Elements Of Array In Sorted Order: ");
        for (int i = 0; i < arr.length; i++) 
        {
          System.out.print(arr[i] + " "+"\n");
        }
    }
}
