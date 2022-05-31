package BasicExercisesPart_I.Question_25;

import java.util.Scanner;

public class Question25 {

    public static void main(String[] args) {
        int number;
        String octal;
        String decimal;
        Scanner input=new Scanner(System.in);

        System.out.println("type a octal number");

        octal=input.nextLine();

        number=Integer.parseInt(octal,8);
        System.out.println(number);
        System.out.println("-----");

        //answer two
        System.out.println("again");
        number=input.nextInt();
        int sum=0;
        int index=0;
        while (number>0)
        {
            sum+=number%10*Math.pow(8,index++);
            number/=10;
        }
        System.out.println(sum);



    }
}

   /* Write a Java program to convert a octal number to a decimal number. Go to the editor
    Input Data:
        Input any octal number: 10
        Expected Output

        Equivalent decimal number: 8
*/