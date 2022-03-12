package Question_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



            Scanner input = new Scanner(System.in);
            int number1,number2, reverse1,reverse2;
            System.out.println("enter a number: ");
            number1=input.nextInt();
            reverse2=number1;

            System.out.println("enter an other number");
            number2=input.nextInt();

            reverse1=number2;

        System.out.printf("first number was: %d second number was:%d %n " +
                "first number: %d, second number:%d ",number1,number2,reverse1,reverse2);


    }

}
  //  Write a Java program to swap two variables