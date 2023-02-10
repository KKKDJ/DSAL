import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Prelim {
    public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the array size: ");
      //input array size by user
      int n = s.nextInt();
      String[] arr = new String[n];
      
      System.out.println("Enter " +n+" elements: ");
       //read elements inputted by user
      for(int i=0; i<n; i++) {
         arr[i] = s.next();
      }
      System.out.println("\n");   

      System.out.println("Unsorted Version: ");
      for (int i = 0; i < n; i++) {
      System.out.print("[" + arr[i] + "] ");
      }

      System.out.println("\n");

      //Bubble Sort
      System.out.println("\nSorting...");
      for(int i = 0; i < (n-1); i++)
      {
         
         for(int j = 0; j < (n-i-1); j++)
         {
            if(arr[j].compareTo(arr[j+1]) > 0)
            {
               String temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
      }
      //Output for Bubble Sort
      System.out.println("The array has been sorted.");
      System.out.println("\nThe new sorted array using Bubble Sort is:");
      for(int i=0; i<n; i++) {
         System.out.print("[" + arr[i] + "]");
      }
      //Insertion Sort
      for (int i = 1; i < n; i++) {
         String key = arr[i];
         int j = i - 1;
         while (j >= 0 && arr[j].compareTo(key) > 0) {
            arr[j + 1] = arr[j];
            j = j - 1;
         }
         arr[j + 1] = key;
      }
      //Output for Insertion Sort
      System.out.println("\n\nThe sorted array using Insertion Sort: ");
      for (int i = 0; i < n; i++) {
         System.out.print("[" + arr[i] + "] ");
      }
      //Closes scanner
      s.close();
   }
}
