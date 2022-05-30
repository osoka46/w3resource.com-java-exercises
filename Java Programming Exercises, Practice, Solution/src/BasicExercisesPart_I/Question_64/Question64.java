import java.util.Scanner;

public class Question64 {
    public static boolean checkDigit(int number1,int number2)
    {
        int []number1Arr=new int[2];
        int []number2Arr=new int[2];

        if (number1<25||number1>75||number2<25||number2>75)
        return false;
        for (int x=0;x<2;x++)
        {
           number1Arr[x]=number1%10;
           number2Arr[x]=number2%10;

           number1/=10;
           number2/=10;
        }

        if(number1Arr[0]==number2Arr[0]||number1Arr[0]==number2Arr[1]||number1Arr[1]==number2Arr[0]||number1Arr[1]==number2Arr[1])
        {
            return true;
        }
        return false;
    }

    public static void run()
    {
        int number1,number2;
        Scanner input=new Scanner(System.in);
        System.out.println("type first number between 25-75");

       number1= input.nextInt();

        System.out.println("type second number between 25-75");
        number2=input.nextInt();
        System.out.println(checkDigit(number1,number2));

    }

    public static void main(String[] args) {
        run();


    }
}

  /*  Write a Java program that accepts two integer values between 25 to 75 and
  return true if there is a common digit in both numbers. Go to the editor
        Sample Output:

        Input the first number : 35
        Input the second number: 45
        Result: true*/