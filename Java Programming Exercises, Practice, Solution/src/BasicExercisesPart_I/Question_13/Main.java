package BasicExercisesPart_I.Question_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float widht,height,area,perimeter;

        System.out.println("enter width of rectangle: ");
        widht= input.nextFloat();

        System.out.println("enter height of rectangle: ");
        height= input.nextFloat();

        area=widht*height;
        perimeter=2*(widht+height);

        System.out.printf("area is %.2f*%.2f= %.2f %n",widht,height,area);
        System.out.printf("perimeter is 2*(%.2f+%.2f)=%.2f",widht,height,perimeter);


    }
}
   /* Write a Java program to print the area and perimeter of a rectangle. Go to the editor
    Test Data:
        Width = 5.6 Height = 8.5

        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20*/