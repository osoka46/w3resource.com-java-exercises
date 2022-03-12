package Question_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,result;

        System.out.println("enter a number");
        number=input.nextInt();

        for (int x=1;x<=10;x++)
        {
            result=number*x;
            System.out.printf("%d x %d: %d %n",number,x,result);
        }

    }
}

/*
7. Write a Java program that takes a number as
        input and prints its multiplication table upto 10. Go to the editor
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80*/
