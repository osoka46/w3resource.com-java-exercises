package BasicExercisesPart_I.Question_17;

public class Main {
    public static void main(String[] args) {
       String number1="10";
       String number2="11";
       String sum1;

     int a=Integer.parseInt(number1,2);
     int b=Integer.parseInt(number2,2);

     sum1=Integer.toBinaryString(a+b);

        System.out.println(sum1);





    }
}

   /* Write a Java program to add two binary numbers. Go to the editor
    Input Data:
        Input first binary number: 10
        Input second binary number: 11

        Expected Output

        Sum of two binary numbers: 101
*/