package BasicExercisesPart_I.Question_82;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner( System.in);
        int size;
        int max=0;
        System.out.println("type the size of arr. size can not be less than 2");
        size=input.nextInt();

        int []arr=new int[size];
        System.out.println("type elements");
        for (int x=0;x< arr.length;x++)
        {
            arr[x]= input.nextInt();
        }

        for (int x=0;x< arr.length;x++)
        {

           max=arr[x]>max?arr[x]:max;

        }
        System.out.println(max);
    }
}

    /*Write a Java program to find the largest element between first, last, and middle values
    from an array of integers (even length). Go to the editor
        Sample Output:

        Original Array: [20, 30, 40, 50, 67]
        Largest element between first, last, and middle values: 67 */