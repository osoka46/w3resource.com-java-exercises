package Question_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1,number2,result;
        System.out.println("enter a number");
        number1=input.nextInt();

        System.out.println("enter an other number");
        number2=input.nextInt();

        result=number1*number2;
        System.out.println("result: "+result);


    }
}
   /* Write a Java program that takes two numbers as input
   and display the product of two numbers. Go to the editor
    Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125*/