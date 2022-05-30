package Question_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number to calculate hexadecimal form");

        int number= input.nextInt();

        String a=Integer.toString(number,16);
        System.out.println(a);
    }
}
/*

    Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
        Input Data:
        Input a decimal number: 15
        Expected Output

        Hexadecimal number is : F */
