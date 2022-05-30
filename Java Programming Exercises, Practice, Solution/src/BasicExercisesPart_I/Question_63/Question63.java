import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Question63 {
    static int number1, number2;

    public static int checkAmount(int number1, int number2) {
        if (number1 == number2)
        { return 0;}
        if (divided(number1,number2))
        {
            return smaller(number1,number2);
        }
        return bigger(number1,number2);
    }

    public static boolean divided(int number1, int number2) {
        if (number1 % 6 == number2 % 6) {
            return true;
        }
        return false;

    }

    public static int smaller(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        }else return number1;
    }
    public static int bigger(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        }else return number2;
    }


    public static void run() {
        Scanner input = new Scanner(in);
        out.println("type first number");
        number1 = input.nextInt();
        out.println("type second number");
        number2 = input.nextInt();
        out.println(checkAmount(number1,number2));

    }


    public static void main(String[] args) {
        run();

    }
}

   /* Write a Java program that accepts two integer values from the user and return the larger values.
   However if the two values are the same, return 0 and
   return the smaller value if the two values have the same remainder when divided by 6. Go to the editor
       Sample Output:

        Input the first number : 12
        Input the second number: 13
        Result: 13*/