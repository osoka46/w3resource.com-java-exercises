package BasicExercisesPart_I.Question_68;

import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class Question68 {
    public static boolean isCheckLenght(String text)
    {
        if(text.length()>=3)
        {
            return true;
        }
        return false;
    }
    public static String createSubstring(String text)
    {
        String subText;
        if (text.length()==3)
            return text;
        return subText=text.substring(text.length()-3);
    }


    public static void main(String[] args) {
        String text="";
        Scanner input=new Scanner(System.in);

        System.out.println("type a string with min. 3 character");
        text= input.nextLine();


        while (!isCheckLenght(text))
        {
            System.out.println("try again");
            text= input.nextLine();
        }
        for (int x=0;x<3;x++) {
            System.out.print(createSubstring(text));
        }

    }
}

    /*Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
    The length of the original string must be 3 and above. Go to the editor
        Sample Output:

        3.03.03.03.0 */