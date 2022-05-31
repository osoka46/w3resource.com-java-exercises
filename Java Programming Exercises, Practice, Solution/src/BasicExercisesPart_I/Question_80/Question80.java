package BasicExercisesPart_I.Question_80;

import java.util.Scanner;

public class Question80 {
    public static void main(String[] args) {
        int bigger=0;
        int[]arr=new int[3];
        Scanner input=new Scanner(System.in);
        System.out.println("type elements of arr length 3");
        for (int x=0;x< arr.length;x++)
        {
            arr[x]= input.nextInt();
        }
        for (int y=0;y<arr.length;y++)
        {
            bigger=arr[y]>bigger?arr[y]:bigger;
        }
        System.out.println("larger:"+bigger);

    }
}

    /*Write a Java program to get the larger value between first and last element of an array (length 3) of integers .
     Go to the editor
        Sample Output:

        Original Array: [20, 30, 40]
        Larger value between first and last element: 40 */