package BasicExercisesPart_I.Question_11;

public class Main {
    public static void main(String[] args) {
        float  radius=7.5f;
        double Area=radius*radius*Math.PI;
        double perimeter=2*radius*Math.PI;

        System.out.printf("perimeter is:  %.14f %narea is: %.14f",perimeter,Area);
        System.out.println();

        System.out.println("perimeter"+perimeter);
        System.out.println("area:"+Area);

        System.out.println("==================");


    }
}
   /* Write a Java program to print the area and perimeter of a circle. Go to the editor
    Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.88912380384689
        Area is = 176.71458676442586*/