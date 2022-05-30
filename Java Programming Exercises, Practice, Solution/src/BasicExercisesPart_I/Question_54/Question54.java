import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Question54 {
    public static boolean isCheckRightMost(int[]arr) {
        int[] lastNumbers = new int[arr.length];
        int count = 0;

        for (int x = 0; x < arr.length; x++) {
            lastNumbers[x] = arr[x] % 10;
        }
        for (int x = 0; x < lastNumbers.length; x++) {
            for (int y = 0; y < lastNumbers.length; y++) {
               if (lastNumbers[x] == lastNumbers[y]&&x!=y)
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.println("how many numbers do you wanna type");
        int number = input.nextInt();
        int[] numbers = new int[number];

        out.println("type numbers");
        int x = 0;
        while (number> 0)
        {
            numbers[x++]=input.nextInt();
            number--;
        }

        out.println(isCheckRightMost(numbers));


    }
}

   /* Write a Java program that accepts three integers from the user and return true
   if two or more of them (integers ) have the same rightmost digit. The integers are non-negative. Go to the editor
        Sample Output:

        Input the first number : 5
        Input the second number: 10
        Input the third number : 15
        The result is: true*/