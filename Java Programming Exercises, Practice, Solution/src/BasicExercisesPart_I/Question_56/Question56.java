import java.util.Scanner;
import static java.lang.System.*;

public class Question56 {
    public static void main(String[] args) {
        Scanner input=new Scanner(in);
        int number1,number2,number3;
        out.println("type first number");
        number1=input.nextInt();

        out.println("type second number");
        number2= input.nextInt();

        out.println("type divisible number");
        number3=input.nextInt();

        for (int x=number1;x<number2;x++)
        {
            if (x%number3==0)
            {
                out.print(x+",");
            }
        }


    }
}

    /*Write a Java program to find the number of values in a given range divisible by a given value. Go to the editor
    For example x = 5, y=20 and p =3,
    find the number of integers within the range x..y
    and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
        Sample Output:

        5*/