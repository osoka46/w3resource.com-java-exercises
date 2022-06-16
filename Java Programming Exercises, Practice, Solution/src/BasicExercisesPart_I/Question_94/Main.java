package BasicExercisesPart_I.Question_94;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void check(ArrayList<Integer>arr)
    {
        ArrayList<Integer>evenNumbers=new ArrayList<>();
        ArrayList<Integer>oddNumbers=new ArrayList<>();
        for(int x=0; x<arr.size();x++)
        {
            if (arr.get(x))
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type size of num. arr");

        int[] arr = new int[input.nextInt()];
        System.out.println("type arr elements");
        int size= arr.length;
        int arrnumbers=0;
        while (size>0)
        {
            arr[arrnumbers]=input.nextInt();
            arrnumbers++;
            size--;
        }

    }
}

   /* Write a Java program to rearrange all the elements
        of a given array of integers so that all the odd numbers come before all the even numbers.*/