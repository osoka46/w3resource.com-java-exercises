package BasicExercisesPart_I.Question_93;

import java.util.Scanner;

public class Main {
    static boolean check(int []arr)
    {
        for (int x=0;x< arr.length-1;x++)
        {
            if(arr[x]==10&&arr[x+1]==10)
            {
                return true;
            }
            else if (arr[x]==20&&arr[x+1]==20)
            {
                return true;
            }
        }
        return false;
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
        System.out.println(check(arr));

    }
}

   /* Write a Java program to test if an array of integers contains an element 10
        next to 10 or an element 20 next to 20, but not both.*/