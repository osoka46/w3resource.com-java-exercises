import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        String hexa;
        String binayNumber;
        int decimalNumber=0;
        Scanner input=new Scanner(System.in);
        System.out.println("type hexa ");

        hexa=input.nextLine();

        String[]arr=hexa.split("",0);

        for (int x=arr.length-1,y=0;x>=0;x--,y++)
        {
            decimalNumber+=Integer.parseInt(arr[x])*Math.pow(16,y);
        }
        System.out.println(decimalNumber);
        binayNumber=Integer.toBinaryString( decimalNumber);
        System.out.println(binayNumber);


    }
}


    /*Write a Java program to convert a hexadecimal to a binary number. Go to the editor
        Input Data:
        Enter Hexadecimal Number : 37
        Expected Output

        Equivalent Binary Number is: 110111*/