package BasicExercisesPart_I.Question_52;

import java.util.Scanner;
import static java.lang.System.*;

public class Question52 {
    public static int sum(int number1,int number2)
    {
        return number1+number2;
    }
    public static boolean isCheck(int sum,int thirdNumber)
    {
        if(sum==thirdNumber)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number1,number2,number3,sum;
        Scanner input=new Scanner(in);
        out.println("type first number");
        number1=input.nextInt();
        out.println("type second number ");
        number2=input.nextInt();
        out.println("type third number ");
        number3= input.nextInt();

        out.println( isCheck(sum(number1,number2),number3));

    }
}
/*

    Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. Go to the editor
        Sample Output:

        Input the first number : 5
        Input the second number: 10
        Input the third number : 15
        The result is: true
*/
