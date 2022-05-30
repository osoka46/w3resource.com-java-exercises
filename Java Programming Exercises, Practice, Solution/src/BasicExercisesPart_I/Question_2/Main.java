package BasicExercisesPart_I.Question_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1,number2,sum;
        System.out.println("enter a number");

        number1=input.nextInt();

        System.out.println("enter an other number");
        number2=input.nextInt();
        sum=number1+number2;


        System.out.printf("sum: %d",sum);

        System.out.println();





    }
}
    /*Write a Java program to print the sum of two numbers. Go to the editor
    Test Data:
        74 + 36
        Expected Output :
        110*/