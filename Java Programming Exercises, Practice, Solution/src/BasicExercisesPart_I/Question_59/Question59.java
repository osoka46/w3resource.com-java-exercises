package BasicExercisesPart_I.Question_59;

import java.util.Scanner;
import static java.lang.System.*;

public class Question59 {

    public  static String toLoverCase(String text)
    {
        String upper=text.toLowerCase();
        return upper;
    }



    public static void main(String[] args) {
        String text;
        Scanner input=new Scanner(in);
        out.println("type a text");

        text=input.nextLine();

        out.println(toLoverCase(text));


    }
}

    /*Write a Java program to convert a given string into lowercase. Go to the editor
    Sample Output:

        Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        the quick brown fox jumps over the lazy dog.*/