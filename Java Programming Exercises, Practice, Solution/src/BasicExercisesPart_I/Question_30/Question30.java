package BasicExercisesPart_I.Question_30;

import java.util.Scanner;

public class Question30 {


    public static void main(String[] args) {
        String hexa;
        String octal;
        int number;

        Scanner input=new Scanner(System.in);
        System.out.println("type hexa");
        hexa=input.nextLine();

        number=Integer.parseInt(hexa,16);


        octal=Integer.toString(number,8);
        System.out.println(octal);


    }
}


   /* Write a Java program to convert a hexadecimal to a octal number. Go to the editor
        Input Data:
        Input a hexadecimal number: 40
        Expected Output

        Equivalent of octal number is: 100 */