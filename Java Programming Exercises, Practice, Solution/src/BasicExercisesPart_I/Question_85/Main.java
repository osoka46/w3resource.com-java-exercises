package BasicExercisesPart_I.Question_85;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        String specText;
        Scanner input=new Scanner(System.in);
        System.out.println("type text");
        text=input.nextLine();

        System.out.println("type specif. word");
        specText=input.nextLine();



        System.out.println(text.trim().toLowerCase().startsWith(specText.trim().toLowerCase()));

    }
}
   /* Write a Java program to check if a string starts with a specified word. Go to the editor
        Sample Data: string1 = "Hello how are you?"
        Sample Output:

        true
*/