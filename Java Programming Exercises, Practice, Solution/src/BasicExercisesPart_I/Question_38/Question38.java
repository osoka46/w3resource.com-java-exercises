package BasicExercisesPart_I.Question_38;

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {
        String text;
        Scanner input=new Scanner(System.in);
        System.out.println("type a text");
        text= input.nextLine();

        char ch;
        char[]arr=text.toCharArray();
        int letter=0, space=0,number=0,other=0;

        for (int x=0;x< arr.length;x++)
        {

            if (Character.isDigit(arr[x]))
            {
                number++;
            }else if(Character.isLetter(arr[x]))
            {
                letter++;
            }else if(Character.isSpaceChar(arr[x]))
            {
                space++;
            }else
            {
              other++;
            }


        }
        System.out.println("letter:"+letter);
        System.out.println("space: "+space);
        System.out.println("number: "+number);
        System.out.println("other: "+other);




    }
}
   /* Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
    Expected Output

    The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33

        letter: 23
        space: 9
        number: 10
        other: 6
        */