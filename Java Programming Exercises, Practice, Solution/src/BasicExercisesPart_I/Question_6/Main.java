package BasicExercisesPart_I.Question_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number1,number2,result;
        System.out.println("enter a number");
        number1=input.nextInt();
        System.out.println("enter an other number");
        number2=input.nextInt();
        result=number1+number2;
        System.out.printf("%d + %d :%d %n",number1,number2,result);

        result=number1-number2;
        System.out.printf("%d - %d :%d %n",number1,number2,result);
        result=number1*number2;

        System.out.printf("%d * %d :%d %n",number1,number2,result);
        result=number1/number2;
        System.out.printf("%d + %d :%d %n",number1,number2,result);
        result=number1%number2;
        System.out.printf("%d + %d :%d %n",number1,number2,result);








    }
}

/*
6. Write a Java program to print the sum (addition),
        multiply, subtract, divide and remainder of two numbers. Go to the editor
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5*/
