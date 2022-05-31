package BasicExercisesPart_I.Question_24;

import java.util.Scanner;

public class Question24 {

    public static void main(String[] args) {
        int number;
        String binary;
        String octal;

        Scanner input=new Scanner(System.in);

        System.out.println("type a binary number");

        binary=input.nextLine();

        number=Integer.parseInt(binary,2);

        octal=Integer.toString(number,8);
        System.out.println(octal);






    }

}

   /* Write a Java program to convert a binary number to a Octal number. Go to the editor
    Input Data:
        Input a Binary Number: 111
        Expected Output

        Octal number: 7 */