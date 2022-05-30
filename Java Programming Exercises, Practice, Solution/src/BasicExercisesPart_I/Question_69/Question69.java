import java.util.Scanner;

public class Question69 {
    public static boolean isCheck(String text)
    {
        if (text.length()%2==1)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String text;
        String subText;
        int middle;
        Scanner input=new Scanner(System.in);
        System.out.println("type text with even length");
        text=input.nextLine();

       while (!isCheck(text))
       {
         System.out.println("tyr again");
         text=input.nextLine();
       }
       middle=text.length()/2;
       subText=text.substring(0,middle);

        System.out.println(subText);


    }
}

  /*  Write a Java program to extract the first half of a string of even length. Go to the editor
    Test Data: Python
        Sample Output:
        Pyt*/