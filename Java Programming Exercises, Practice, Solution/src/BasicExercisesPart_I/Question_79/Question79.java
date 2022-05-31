package BasicExercisesPart_I.Question_79;

import java.util.Arrays;
import java.util.Scanner;

public class Question79 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] copyArr = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("type elements of arr length 3");

        for (int x = 0; x < arr.length; x++) {
            arr[x] = input.nextInt();
        }

      //  System.out.println(Arrays.toString(arr));

        for (int x = 0, y = -1; x < arr.length; x++, y++) {
            if (x == 0) {
                copyArr[copyArr.length - 1]=arr[0];

            } else {
                copyArr[y]=arr[x];
            }
        }


        System.out.println("elements of original arr");
        System.out.println(Arrays.toString(arr));
        System.out.println("elements of copy arr");
        System.out.println(Arrays.toString(copyArr));
    }
}

   /* Write a Java program to rotate an array (length 3) of integers in left direction. Go to the editor
        Sample Output:

        Original Array: [20, 30, 40]
        Rotated Array: [30, 40, 20]*/