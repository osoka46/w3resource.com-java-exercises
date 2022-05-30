package BasicExercisesPart_I.Question_4;

public class Main {
    public static void main(String[] args) {

        int number1,number2,number3,number4,number5,number6,result;


        number1=-5; number2=8;number3=6; result=number1+(number2*number3);
        System.out.println(result);

        number1=55; number2=9;result=(number1+number2)%number2;
        System.out.println(result);

        number1=20;number2=-3;number3=5; number4=8;result=number1+(number2*number3)/number4;
        System.out.println(result);

        number1=5;number2=15;number3=3;number4=2;number5=8;number6=3;
        result=number1+(number2/number3*number4)-(number5%number6);
        System.out.println(result);

    }
}

/*
4. Write a Java program to print the result of the following operations. Go to the editor
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13*/
