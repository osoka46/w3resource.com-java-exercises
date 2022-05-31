package BasicExercisesPart_I.Question_53;

import java.util.Scanner;

import static java.lang.System.*;
public class Question53 {
    public static boolean isGreater(int number1,int number2,int number3)
    {
        if((number3>number2)&&(number2>number1))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(in);
        int number1,number2,number3;

        out.println("type first number");
        number1=input.nextInt();

        out.println("type second number");
        number2=input.nextInt();

        out.println("type third number");
        number3=input.nextInt();

        out.println(isGreater(number1,number2,number3));


    }
}

    /*Write a Java program that accepts three integers from the user and return true
    if the second number is greater than first number and third number is greater than second number.



        Input the first number : 5
        Input the second number: 10
        Input the third number : 15
        The result is: true*/