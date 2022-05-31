package BasicExercisesPart_I.Question_77;

import java.util.Scanner;

public class Question77 {
    public static int[] creatArray(int[]arr)
    {
        Scanner input=new Scanner(System.in);
        for (int x=0;x<3;x++)
        {
            arr[x]= input.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr1=new int[3];
        int []arr2=new int[3];
        int []newArr=new int[2];

        System.out.println("type 3 elements for first arr");
        creatArray(arr1);
        System.out.println("type 3 elements for second arr");
        creatArray(arr2);

        newArr[0]=arr1[0];
        newArr[1]=arr2[arr2.length-1];
        System.out.println("new arr is :");
        for (int elements:newArr)
        {
            System.out.println(elements);
        }
    }
}
/*

    Write a Java program to create a new array of length 2 from two arrays of integers with three elements
     and the new array will contain the first and last elements from the two arrays. Go to the editor
        Test Data: array1 = 50, -20, 0
        array2 = 5, -50, 10
        Sample Output:

        Array1: [50, -20, 0]
        Array2: [5, -50, 10]
        New Array: [50, 10]*/
