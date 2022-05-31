package BasicExercisesPart_I.Question_75;

import java.util.Scanner;

public class Question75 {
    public static boolean isCheckedSize(int size)
    {
        if (size<2)
        {
            return false;
        }
        return true;
    }
    public static boolean isCheckLastFirst(int[]arr)
    {
        if (arr[0]==arr[arr.length-1])
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int size;
        int[]arr;
        Scanner input=new Scanner(System.in);
        System.out.println("what size are do you wanna creat, size can not be less than 2");
        size=input.nextInt();

       if (isCheckedSize(size))
       {
           System.out.println("type elements");
           arr=new int[size];
           for (int x=0;x< arr.length;x++)
           {
               arr[x]=input.nextInt();
           }
           System.out.println(isCheckLastFirst(arr));
       }else {
           System.out.println("wrong size");
       }




    }
}
/*

    Write a Java program to test if the first and the last element of an array of integers are same.
     The length of the array must be greater than or equal to 2. Go to the editor
        Test Data: array = 50, -20, 0, 30, 40, 60, 10
        Sample Output:

        false*/
