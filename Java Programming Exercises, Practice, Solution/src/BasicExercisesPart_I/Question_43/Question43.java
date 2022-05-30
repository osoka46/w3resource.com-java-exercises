import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Question43 {
    public static void main(String[] args) {
        String text;
        Scanner input=new Scanner(System.in);

         text="Twinkle, twinkle, little star, \nHow I wonder what you are! \nUp above the world so high, \nLike a diamond in the sky. \nTwinkle, twinkle, little star, \nHow I wonder what you are";


        String[]arr=text.split(System.lineSeparator());
        out.println(arr.length);


        for (int x=0;x< arr.length;x++)
        {
            switch (x)
            {
                case 0:
                    out.println(arr[x]);
                    break;
                case 1:
                    out.println("\t"+arr[x]);
                    break;
                case 2:
                    out.println("\t\t"+arr[x]);
                    break;
                case 3:
                    out.println("\t\t\t"+arr[x]);
                    break;
                case 4:
                    out.println("\t\t\t\t"+arr[x]);
                    break;
                case 5:
                    out.println("\t\t\t\t\t"+arr[x]);
                    break;

            }

        }





    }
}

   /* Write a Java program to print the following string in a specific format (see the output). Go to the editor
        Sample Output

        Twinkle, twinkle, little star,
            How I wonder what you are!
                 Up above the world so high,
                    Like a diamond in the sky.
                        Twinkle, twinkle, little star,
                            How I wonder what you are
        */