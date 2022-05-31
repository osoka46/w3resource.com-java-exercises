package BasicExercisesPart_I.Question_83;

import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] arr1;
        int[]arr2;
        int[]multiArr;
        Scanner input=new Scanner(in);

        System.out.println("type the size of arr. Sizes must be the same for both arr and can not be less than 2");
        size=input.nextInt();

        arr1=new int[size];
        arr2=new int[size];
        multiArr=new int[size];


        System.out.println("type elements of first arr");
        for (int x=0;x< arr1.length;x++)
        {
            arr1[x]= input.nextInt();
        }

        System.out.println("type elements of second arr");
        for (int x=0;x< arr2.length;x++)
        {
            arr2[x]= input.nextInt();
        }

        ARR obje=new ARR(arr1,arr2,multiArr);
        obje.run();

    }
}
    /*Write a Java program to multiply corresponding elements of two arrays of integers. Go to the editor
    Sample Output:

        Array1: [1, 3, -5, 4]

        Array2: [1, 4, -5, -2]

        Result: 1 12 25 -8*/