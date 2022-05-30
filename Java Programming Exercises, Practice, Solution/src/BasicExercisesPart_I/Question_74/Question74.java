package Question74;

import java.util.ArrayList;
import java.util.Scanner;

public class Question74 {
    public static ArrayList<Integer> inputArr() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("size can not less than 2, type -1 to exit");
        do {
            list.add(input.nextInt());
            if (list.contains(-1)){
                break;
            }
        } while (!checkLength(list));
        while (!list.contains(-1))
        {
            list.add(input.nextInt());
        }
        list.remove(list.size()-1);
        return list;
    }


    public static boolean checkLength (ArrayList<Integer>arr)
    {
        if (arr.size()<2)
        {
            System.out.println("list can be less than 2");
            return false;
        }
        return true;
    }
    public static boolean ifCheckLastFirstNumber(ArrayList<Integer>arrayList)
    {
        if(arrayList.get(0)==10&&arrayList.get(arrayList.size()-1)==10)
        {
            return true;
        }

        return false;
    }
    public static void run()
    {
        System.out.println(ifCheckLastFirstNumber(inputArr()));

    }
    public static void main(String[] args) {

    run();

    }
}

    /*Write a Java program to test if 10 appears as either the first or last element of an array of integers.
    The length of the array must be greater than or equal to 2. Go to the editor
        Sample Output:
        Test Data: array = 10, -20, 0, 30, 40, 60, 10

        true*/