package BasicExercisesPart_I.Question_37;

import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String text;

        System.out.println("type a text");
        text=input.nextLine();


        char[]chars = text.toCharArray();

        for (int x=chars.length-1;x>=0;x--)
        {
            System.out.print(chars[x]);
        }
        System.out.println();

        // answer two
        System.out.println("type an other text");

        text=input.nextLine();

        String [] stringArr=text.split("",0);

        for (int x=stringArr.length-1;x>=0;x--)
        {
            System.out.print(stringArr[x]);
        }

        //answer three


    }
}

   /* Write a Java program to reverse a string. Go to the editor
        Input Data:
        Input a string: The quick brown fox
        Expected Output

        Reverse string: xof nworb kciuq ehT
*/