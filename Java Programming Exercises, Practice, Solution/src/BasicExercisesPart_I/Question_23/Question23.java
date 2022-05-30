import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        String binary;
        String hexa;

        System.out.println("type a binary");

        binary=input.nextLine();

        number=Integer.parseInt(binary,2);
        hexa=Integer.toString(number,16);

        System.out.println(hexa);




    }
}

/*

    Write a Java program to convert a binary number to hexadecimal number. Go to the editor
        Input Data:
        Input a Binary Number: 1101
        Expected Output

        HexaDecimal value: D*/
