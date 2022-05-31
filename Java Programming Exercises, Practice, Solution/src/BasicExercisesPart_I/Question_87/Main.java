package BasicExercisesPart_I.Question_87;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void findDigit(int number)
    {
        ArrayList <Integer>list=new ArrayList<>();
        while (number>0)
        {
            list.add(number%10);
            number/=10;
        }
        print(list);
    }
    static void print(ArrayList<Integer> list)
    {
        String []arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int a=0;a<list.size();a++)
        {
            switch (list.get(a))
            {
                case 0:
                    System.out.println(arr[0]);
                    break;
                case 1:
                    System.out.println(arr[1]);
                    break;
                case 2:
                    System.out.println(arr[2]);
                    break;
                case 3:
                    System.out.println(arr[3]);
                    break;
                case 4:
                    System.out.println(arr[4]);
                    break;
                case 5:
                    System.out.println(arr[5]);
                    break;
                case 6:
                    System.out.println(arr[6]);
                    break;
                case 7:
                    System.out.println(arr[7]);
                    break;
                case 8:
                    System.out.println(arr[8]);
                    break;
                case 9:
                    System.out.println(arr[9]);
                    break;
            }
        }
    }

    static void run()
    {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("type a number");
        number=input.nextInt();
        findDigit(number);

    }
    public static void main(String[] args) {

       run();


    }
}
  /*  Write a Java program than read an integer and calculate the sum of its digits
        and write the number of each digit of the sum in English. Go to the editor*/