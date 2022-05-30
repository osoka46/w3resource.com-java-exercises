package Question72;

import static java.lang.System.*;

import java.util.Scanner;

public class Question72 {

    public static boolean checkLength(String text) {
        if (text.length() < 3)
            return false;
        return true;
    }

    public static void run(String text) {
        if (checkLength(text)) {
            printString(text);
        } else {
            out.println("###");
        }

    }

    public static void printString(String text) {
        out.println(text.substring(0, 3));
    }


    public static void main(String[] args) {

        String text;
        Scanner input = new Scanner(in);
        out.println("type a text");
        text = input.nextLine();
        run(text);
    }
}

   /* Write a Java program to create a new string taking first three characters from a given string.
    If the length of the given string is less than 3 use "#" as substitute characters. Go to the editor
        Test Data: Str1 = " "
        Sample Output:###
        */