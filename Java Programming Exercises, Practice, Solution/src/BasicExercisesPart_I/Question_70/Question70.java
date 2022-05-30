import java.util.Scanner;

public class Question70 {
    public static boolean checkLength(String text1,String text2)
    {
        if (text1.length()==text2.length())
        {
            return false;
        }
        return true;
    }

    public static  void run()
    {
        String text1;
        String text2;
        Scanner input=new Scanner(System.in);
        System.out.println("you will type 2 words. They should not have the same lenght.\ntype first number");
        text1=input.nextLine();
        System.out.println("type second text");
        text2=input.nextLine();

        if (checkLength(text1,text2))
        {
            System.out.println(concatStrings(text1,text2));

        }else {
            System.out.println("words' length are the same");
        }
    }
    public static String concatStrings(String text1,String text2)
    {
        String last;
        if(text1.length()>text2.length())
        {
            last=text2.concat(text1)+text1;
        }else {
            last=text1.concat(text2)+text2;
        }
        return last;

    }

    public static void main(String[] args) {

        run();

    }
}

   /* Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
   The strings must not have the same length. Go to the editor
        Test Data: Str1 = Python
        Str2 = Tutorial

        Sample Output:

        PythonTutorialPython*/