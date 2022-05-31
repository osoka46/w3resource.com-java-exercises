package BasicExercisesPart_I.Question_81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] converseArr(int []arr)
    {
        int copy=arr[0];
       for(int x=0;x< arr.length;x++)
       {
           if(x==0)
           {
               arr[x]= arr[arr.length-1];
           }
           if (x== arr.length-1)
           {
              arr[arr.length-1]=copy;
           }
       }


        return arr;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner( System.in);
        int size;
        System.out.println("type the size of arr. size can not be less than 2");
        size=input.nextInt();

        int []arr=new int[size];
        System.out.println("type elements");
        for (int x=0;x< arr.length;x++)
        {
            arr[x]= input.nextInt();
        }
        System.out.print(Arrays.toString(converseArr(arr)));

    }
}
   /* Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array. Go to the editor
        Sample Output:

        Original Array: [20, 30, 40]
        New array after swaping the first and last elements: [40, 30, 20] */