package BasicExercisesPart_I.Question_51;

import java.util.Scanner;
import static java.lang.System.*;
public class Question51 {
    public static void main(String[] args) {
        Scanner input=new Scanner(in);
        String text;
        int number;


        out.println("type a number");
        text=input.nextLine();
        out.println();
        number=Integer.parseInt(text);
        out.println(number);


    }
}

   /* Write a Java program to convert a string to an integer in Java. Go to the editor
    Sample Output:

        Input a number(string): 25
        The integer value is: 25*/
