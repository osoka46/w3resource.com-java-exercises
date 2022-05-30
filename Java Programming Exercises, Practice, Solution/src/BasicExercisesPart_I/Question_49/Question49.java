import java.util.Scanner;
import static java.lang.System.*;

public class Question49 {
    public static void main(String[] args) {
        int number;
        int result;
        Scanner input=new Scanner(in);
        out.println("type a number");
        number=input.nextInt();

        result=number%2==0?0:1;

        out.println(result);

    }
}

   /* Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. Go to the editor
        Sample Output:

        Input a number: 20
        1*/