package BasicExercisesPart_I.Question_92;

import java.util.Scanner;

public class Main {
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

        int even = 0, odd = 0;
        for (int a = 0; a < arr.length; a++) {
            if (a % 2 == 1) {
                odd += arr[a];
            } else {
                even += arr[a];
            }
        }
        System.out.println("even numbers: "+even);
        System.out.println("odd numbers: "+odd);

    }
}
   /* Write a Java program to count the number of even and
        odd elements in a given array of integers. Go to the editor*/