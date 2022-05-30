import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Question62 {
    public static boolean isCheck(int number1,int number2,int number3)

    {
        if (number2!=20)
        {
            return false;
        }
        if (abs(number1-number2)>=20||abs(number2-number3)>=20||abs(number3-number1)>=20)
        {
            return true;
        }
        return false;
    }

    public static void run()
    {
        int number1,number2,number3;
        Scanner input=new Scanner(in);
        out.println("type a number");
        number1= input.nextInt();
        out.println("type second number");
        number2= input.nextInt();
        out.println("type third number");
        number3= input.nextInt();

        out.println(isCheck(number1,number2,number3));

    }

    public static void main(String[] args) {

        run();

    }
}

   /* Write a Java program that accepts three integer values and return true
   if one of them is 20 or more and less than the substractions of others. Go to the editor
        Sample Output:

        Input the first number : 15
        Input the second number: 20
        Input the third number : 25
        false*/