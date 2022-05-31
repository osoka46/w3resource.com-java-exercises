package BasicExercisesPart_I.Question_60;

import java.util.Scanner;
import static java.lang.System.*;
public class Question60 {
    static String text;
    public static String penultimate(String text)
    {


        String[]arr=text.split(" ",0);
        return arr[arr.length-2];
    }

    public static void input( )
    {

        Scanner input=new Scanner(in);
        out.println("type a text");
        text=input.nextLine();
        out.println(penultimate(text));
    }


    public static void main(String[] args) {

       input();
    }
}

    /*Write a Java program to find the penultimate (next to last) word of a sentence. Go to the editor
        Sample Output:

        Input a String: The quick brown fox jumps over the lazy dog.
        Penultimate word: lazy*/