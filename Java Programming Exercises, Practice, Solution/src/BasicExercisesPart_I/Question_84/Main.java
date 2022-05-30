package Question84;

import Question83.ARR;

import java.util.Scanner;

public class Main {
    public static boolean checkLength (String text)
    {
        if (text.length()<3)
        {
            return false;
        }
        return true;
    }
    public static void printArr(String text)
    {
        String subText=text.substring(text.length()-3);
        System.out.println(subText+text+subText);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("type a text length musst be min 3");
        text = input.nextLine();

        if (!checkLength(text))
        {
            System.out.println("text size is too small");
        }else {
            printArr(text);
        }

    }
}
    /*Write a Java program to take the last three characters from a given string and
    add the three characters at both the front and back of the string.
    String length must be greater than three and more. Go to the editor
        Test data: "Python" will be "honPythonhon"
        Sample Output:

        honPythonhon*/