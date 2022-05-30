import java.util.Scanner;
import static java.lang.System.*;

public class Question44 {
    public static void main(String[] args) {
        Scanner input=new Scanner(in);
        int number;
        String sum="";
        out.println("type an integer");
        number=input.nextInt();


        for (int x=1;x<=3;x++)
        {
            sum+=number;
            out.print(sum);
            if (x==3)
                break;
            out.print(" + ");

        }



    }
}


    /*Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
        Sample Output:

        Input number: 5
        5 + 55  + 555
*/