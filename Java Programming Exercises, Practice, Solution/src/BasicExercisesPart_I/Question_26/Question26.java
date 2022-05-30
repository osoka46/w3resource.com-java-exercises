import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        int decimalNumber;
        String octal;
        String binary;
        Scanner input=new Scanner(System.in);
        System.out.println("type a octal number");

        octal=input.nextLine();

        decimalNumber=Integer.parseInt(octal,8);

        binary=Integer.toBinaryString(decimalNumber);

        System.out.println(binary);



    }
}


  /*  Write a Java program to convert a octal number to a binary number. Go to the editor
    Input Data:
        Input any octal number: 7
        Expected Output

        Equivalent binary number: 111 */