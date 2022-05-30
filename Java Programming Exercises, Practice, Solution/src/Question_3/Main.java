package Question_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number1,number2,result;

        System.out.println("enter a number");

        number1=input.nextInt();

        System.out.println("enter a other number");

        number2=input.nextInt();

        result=number1/number2;

        System.out.printf("%d diveded %d :%d",number1,number2,result);


    }
}

   /* Write a Java program to divide two numbers and print on the screen. Go to the editor
    Test Data :
        50/3
        Expected Output :
        16*/