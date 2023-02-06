import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class OE2 {
    public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the array size: ");

      //input array size by user
      int n = s.nextInt();
      int[] arr = new int[n];
      
      System.out.print("Enter " +n+" elements: ");
       //read elements inputted by user
      for(int i=0; i<n; i++)
         arr[i] = s.nextInt();
      
      System.out.println("\nSorting...");
      for(int i = 0; i < (n-1); i++)
      {
         
         for(int j = 0; j < (n-i-1); j++)
         {
            if(arr[j] > arr[j+1])
            {
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
         //iteration
         System.out.print("\nIteration #" +(i+1)+ " ->  ");
         for(int j=0; j<n; j++)
            System.out.print(arr[j]+ " ");
      }
      
      System.out.println("\n\nThe array has been sorted.");
      System.out.println("\nThe new sorted array is:");
      for(int i=0; i<n; i++)
         System.out.print(arr[i]+ " ");
   }
}
