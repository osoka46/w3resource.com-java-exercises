package BasicExercisesPart_I.Question_61;

import java.util.Scanner;

public class Question61 {

    public static String reverseWord(String word) {
        char[] arr = word.toCharArray();
        String reversed = "";

        for (int x = arr.length - 1; x >= 0; x--) {
            reversed += arr[x];
        }

        return reversed;
    }

    public static void run() {
        String word;
        Scanner input = new Scanner(System.in);
        System.out.println("type a word");
        word = input.next();
        System.out.println(reverseWord(word));

    }

    public static void main(String[] args) {
        run();

    }
}

    /*Write a Java program to reverse a word. Go to the editor
        Sample Output:

        Input a word: dsaf
        Reverse word: fasd*/