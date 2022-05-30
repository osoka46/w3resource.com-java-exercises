package BasicExercisesPart_I.Question_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []arr=new int[3];
        int sum=0;
        float average;


        System.out.println("enter a number");
        arr[0]=input.nextInt();

        for (int x=1;x<arr.length;x++)
        {
            System.out.println("enter an other number");
            arr[x]=input.nextInt();
        }

       for(int element:arr)
        {
            sum+=element;
        }

       average=sum/3;

        System.out.println("average: "+average);
    }

}

   /* Write a Java program that takes three numbers as
        input to calculate and print the average of the numbers. Go to the editor
    Click me to see the solution*/