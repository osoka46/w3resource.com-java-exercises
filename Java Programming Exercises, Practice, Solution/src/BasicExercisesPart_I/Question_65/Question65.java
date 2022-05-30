import java.util.Scanner;

public class Question65 {
    public static int calculateModules(int number1,int number2)
    {
        int divide=0;
        if(number1>number2) {
            divide = number1 / number2;
            return number1-divide*number2;
        }else if (number2>number1)
        {
            divide=number2/number1;
            return number2-divide*number1;
        }

        return 0;

    }

    public static void main(String[] args) {
        int number1,number2;

        Scanner input=new Scanner(System.in);

        System.out.println("type a number");
        number1= input.nextInt();

        System.out.println("type second number");
        number2=input.nextInt();
        System.out.println(calculateModules(number1,number2));


    }
}

   /* Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator. Go to the editor
    Sample Output:

        Input the first number : 19
        Input the second number: 7
          5
          */