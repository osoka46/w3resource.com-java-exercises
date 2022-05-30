import java.util.Arrays;

public class Question50 {
    public static void main(String[] args) {
        //answer with array
        int[] arr3 = new int[100];
        int[] arr5 = new int[100];
        int[] arrBoth = new int[100];
        int index = 0;


        System.out.print("divided by 3: \n");

        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0) {
                arr3[index++] = x;
            }
        }
        for (int element : arr3) {
            if (element>0)
            {
                System.out.print(element+",");
            }
        }
        System.out.println();

        index = 0;
        System.out.print("divided by 5:\n");
        for (int x = 1; x <= 100; x++) {
            if (x % 5 == 0) {
                arr5[index++] = x;
            }
        }
        for (int element : arr5) {
            if (element>0)
            {
                System.out.print(element+",");
            }
        }
        index = 0;
        System.out.println();
        System.out.print("divided by Both:\n");


        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                arrBoth[index++] = x;
            }
        }
        for (int element : arrBoth) {
            if (element>0)
            {
                System.out.print(element+",");
            }
        }


    }
}

    /*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. Go to the editor
        Sample Output:

        Divided by 3:
        3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
        , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

        Divided by 5:
        5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
        95,

        Divided by 3 & 5:
        15, 30, 45, 60, 75, 90,*/