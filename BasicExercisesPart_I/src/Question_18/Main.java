package Question_18;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    static int pow(int ceil, int exponent) {
        int pow = 1;

        for (int x = 1; x <= exponent; x++) {
            pow *= ceil;

        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 10;
        int number2 = 11;
        int copyNumber = number;
        int copyNumber2 = number2;
        int count = 0;
        int count2 = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (copyNumber > 0) {
            copyNumber /= 10;
            count++;
        }


        for (int x = 0; x < count; x++) {
            sum1 += (number % 10) * pow(2, x);
            number /= 10;

        }


        while (copyNumber2 > 0) {
            copyNumber2 /= 10;
            count2++;
        }


        for (int x = 0; x < count2; x++) {
            sum2 += (number2 % 10) * pow(2, x);
            number /= 10;

        }
        int total = sum1 + sum2;
        System.out.println(sum2 + sum1);
        String a = "";

        while (total > 0) {
            a += (total % 2 == 0) ? "0" : "1";
            total /= 2;
        }
        System.out.println(a);


    }

}
    /*Write a Java program to multiply two binary numbers. Go to the editor
    Input Data:
        Input the first binary number: 10
        Input the second binary number: 11
        Expected Output

        Product of two binary numbers: 110 */