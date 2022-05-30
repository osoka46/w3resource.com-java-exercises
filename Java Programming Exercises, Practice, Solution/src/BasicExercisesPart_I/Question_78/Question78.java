package Question78;

import java.util.Scanner;

public class Question78 {
    public static void main(String[] args) {
        int[]arr=new int[2];
        Scanner input=new Scanner(System.in);
        System.out.println("type elements of arr length 2");
        for (int x=0;x< arr.length;x++)
        {
            arr[x]= input.nextInt();
        }


        int count=0;
        for (int y=0;y< arr.length;y++)
        {
            if (arr[y]==4||arr[y]==7)
            {
                count++;
                break;
            }
        }
        if (count>0)
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

    /*Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7. Go to the editor
        Sample Output:

        Original Array: [5, 7]
        true */