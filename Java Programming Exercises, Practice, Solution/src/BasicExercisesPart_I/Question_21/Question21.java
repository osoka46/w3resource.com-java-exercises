import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        String a;
        int number;
        Scanner input=new Scanner(System.in);

        System.out.println("type a number to calculate octal");


        number=input.nextInt();
        a=Integer.toString(number,8);

        System.out.println(a);



    }
}

   /* Write a Java program to convert a decimal number to octal number. Go to the editor
        Input Data:
        Input a Decimal Number: 15
        Expected Output

        Octal number is: 17  */