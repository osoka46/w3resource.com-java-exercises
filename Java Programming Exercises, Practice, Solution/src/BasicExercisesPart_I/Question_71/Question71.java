package BasicExercisesPart_I.Question_71;

import java.util.Scanner;

public class Question71 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String text1,text2;


        System.out.println("type first word");
        text1=input.nextLine();

        System.out.println("type second text");

        text2=input.nextLine();

        Text object=new Text(text1,text2);
        object.run();


    }
}

    /*Write a Java program to create the concatenation of the two strings except removing the first character of each string.
    The length of the strings must be 1 and above. Go to the editor
        Test Data: Str1 = Python
        Str2 = Tutorial
        Sample Output:

        ythonutorial*/