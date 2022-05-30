import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        int number1,number2,sum;
        Scanner input=new Scanner(System.in);
        System.out.println("type a number");
        number1= input.nextInt();
        System.out.println("type an other number");
        number2=input.nextInt();
        sum=number1+number2;

        System.out.println(sum);

    }
}

    /*Write a Java program and compute the sum of the digits of an integer. Go to the editor
        Input Data:
        Input an integer: 25
        Expected Output

        The sum of the digits is: 7*/