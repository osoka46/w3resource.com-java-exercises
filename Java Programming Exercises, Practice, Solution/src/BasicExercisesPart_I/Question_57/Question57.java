package BasicExercisesPart_I.Question_57;

import java.util.Scanner;
import static java.lang.System.*;
public class Question57 {
    public static void main(String[] args) {
        Scanner input=new Scanner(in);
        int count=1;
        int number;
        int middle;

        out.println("type a number");

        number=input.nextInt();
        middle=number/2;

        for(int x=1;x<=middle;x++)
        {
         if(number%x==0)
         {
             count++;
         }
        }
        out.println(count);
    }
}

    /*Write a Java program to accepts an integer and count the factors of the number. Go to the editor
    Sample Output:

        Input an integer: 25
        3*/