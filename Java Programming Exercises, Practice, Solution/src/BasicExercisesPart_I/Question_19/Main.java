package BasicExercisesPart_I.Question_19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        String b;
        String c="";
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number to calculate binary form");

        int number= input.nextInt();

        a=Integer.toBinaryString(number);
        b=Integer.toString(number,2);

        while (number>0)
        {
            c+=number%2==0?"0":1;
            number/=2;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);












    }
}
    /*Write a Java program to convert a decimal number to binary number. Go to the editor
        Input Data:
        Input a Decimal Number : 5
        Expected Output

        Binary number is: 101 */