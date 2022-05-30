import java.util.Scanner;
import static java.lang.System.out;


public class Question41 {


    public static void main(String[] args) {
        {
            Scanner input=new Scanner(System.in);
            char ch;

            out.println("type a char to compute asscii");
            ch=input.next().charAt(0);

            out.print((int) ch);

        }

    }
}

    /*Write a Java program to print the ascii value of a given character. Go to the editor
    Expected Output

    The ASCII value of Z is :90*/