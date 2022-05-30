import java.util.Scanner;

public class Question35 {
     public static double pow(double side, int pow)
     {
         double power=1;
         for(int x=1;x<=pow;x++)
         {
             power*=side;
         }
         return power;
     }
    public static void main(String[] args) {
        int numberofSides;
        double lenghtOfSide;
        double area;
        Scanner input=new Scanner(System.in);

        System.out.println("type number of sides");
        numberofSides=input.nextInt();
        System.out.println("type lenght of one of the sides");
        lenghtOfSide=input.nextDouble();
        area=numberofSides*pow(lenghtOfSide,2)/(4*Math.tan(Math.PI/numberofSides));

        System.out.println(area);


    }
}


   /* Write a Java program to compute the area of a polygon. Go to the editor
    Area of a polygon = (n*s^2)/(4*tan(π/n))
    where n is n-sided polygon and s is the length of a side
        Input Data:
        Input the number of sides on the polygon: 7
        Input the length of one of the sides: 6
        Expected Output

        The area is: 130.82084798405722*/