package BasicExercisesPart_I.Question_22;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        String a;

        System.out.println("type a binary number");

        a= input.nextLine();

        number=Integer.parseInt(a,2);

        System.out.println(number);


        //answer two
        System.out.println("type");
        number=input.nextInt();
        int sum=0;




        for (int x= a.length()-1,y=0;x>=0;x--,y++)
        {
            sum+=number%10*Math.pow(2,y);
            number/=10;

        }
        System.out.println(sum);



    }
}
/*

    Write a Java program to convert a binary number to decimal number. Go to the editor
        Input Data:
        Input a binary number: 100
        Expected Output

        Decimal Number: 4 */
