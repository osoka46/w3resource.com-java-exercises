package BasicExercisesPart_I.Question_34;

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double side,area;
        System.out.println("type a side of hexagon to compute area");
        side=input.nextInt();
        area=(6*Math.pow(side,2))/(4*Math.tan(Math.PI/6));

        System.out.println(area);



    }
}

   /* Write a Java program to compute the area of a hexagon. Go to the editor
    Area of a hexagon = (6 * s^2)/(4*tan(π/6))
    where s is the length of a side
    Input Data:
        Input the length of a side of the hexagon: 6
        Expected Output

        The area of the hexagon is: 93.53074360871938*/