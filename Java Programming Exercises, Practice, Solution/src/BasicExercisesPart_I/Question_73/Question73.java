package Question73;

import java.util.Scanner;

public class Question73 {
    public static String subString(String text1,String text2)
    {
        String last;
        if(text1.isEmpty())
        {
            last="#"+text2.charAt(0);
            return last;
        }
        else if(text2.isEmpty())
        {
            last=text1.charAt(0)+"#";
            return last;
        }
        return text1.substring(0)+text2.substring(text1.length()-1);
    }
    public static void main(String[] args) {
        String text1,text2;
        Scanner input=new Scanner(System.in);

        System.out.println("type two words. \nFirst word:  ");
        text1=input.nextLine();

        System.out.println("type second word");
        text2=input.nextLine();
        System.out.println(subString(text1,text2));

    }

}

   /* Write a Java program to create a new string taking first and last characters from two given strings.
    If the length of either string is 0 use "#" for missing character. Go to the editor
        Test Data: str1 = "Python"
        str2 = " "
        Sample Output: P#
        */