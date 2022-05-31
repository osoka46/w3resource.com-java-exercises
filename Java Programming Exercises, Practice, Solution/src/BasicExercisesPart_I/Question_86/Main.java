package BasicExercisesPart_I.Question_86;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number;
        int middNumber;
        System.out.println("type a number");

        number=input.nextInt();
        middNumber=number/2;

        while (number>0)
        {
            if(number%2==1)
            {
                number=(3*number+1);
            }
            number/=2;
            System.out.println(number);

            if (number==1)
            {
                break;
            }
        }




    }
}
   /* Write a Java program start with an integer n,
        if n is even divide by 2,
        if n is odd   multiply by 3
        add 1 , repeat the process until n = 1. Go to the editor
*/