package BasicExercisesPart_I.Question_58;

import java.util.Scanner;

public class Question58 {

    public static void toUpperCase(String text) {

        String[] chars = text.split("", 0);

        for (int x = 0; x < chars.length; x++) {
            if (x == 0) {
                chars[x] = chars[x].toUpperCase();
            }
        }
        for (String element : chars) {
            System.out.print(element);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("type a text");
        text = input.nextLine();
        String[] arr = text.split(" ", 0);


        for (int x = 0; x < arr.length; x++) {

            toUpperCase(arr[x]);
            System.out.print(" ");

        }

        // answer two




    }

}

   /* Write a Java program to capitalize the first letter of each word in a sentence. Go to the editor
    Sample Output:

        Input a Sentence: the quick brown fox jumps over the lazy dog.
        The Quick Brown Fox Jumps Over The Lazy Dog.
*/