import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        String octal;
        String hexadecimal;

        System.out.println("type   a octal");

        octal= input.nextLine();

        number=Integer.parseInt(octal,8);
        hexadecimal=Integer.toString(number,16);
        System.out.println(hexadecimal);

    }
}

    /*Write a Java program to convert a octal number to a hexadecimal number. Go to the editor
    Input Data:
        Input a octal number : 100
        Expected Output

        Equivalent hexadecimal number: 40*/