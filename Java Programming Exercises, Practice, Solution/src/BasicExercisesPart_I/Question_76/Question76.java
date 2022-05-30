package Question76;

import java.util.Scanner;

public class Question76 {
    public static boolean isCheckedSize(int size)
    {
        if (size<2)
        {
            return false;
        }
        return true;
    }
    public static boolean isCheckLastFirst(int[]arr1,int[]arr2)
    {
        if (arr1[0]==arr2[0]||arr1[arr1.length-1]==arr2[arr2.length-1])
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int size1;
        int size2;
        int[]arr1;
        int []arr2;
        Scanner input=new Scanner(System.in);
        System.out.println("what size are do you wanna creat, size can not be less than 2.\nfirst array size:");
        size1=input.nextInt();
        System.out.println("second arr size");
        size2= input.nextInt();

        if (isCheckedSize(size1)&&isCheckedSize(size2))
        {
            System.out.println("type elements of first arr");
            arr1=new int[size1];
            for (int x=0;x< arr1.length;x++)
            {
                arr1[x]=input.nextInt();
            }
            System.out.println("type elements of second arr");
            arr2=new int[size2];
            for (int x=0;x< arr2.length;x++)
            {
                arr2[x]=input.nextInt();
            }

            System.out.println(isCheckLastFirst(arr1,arr2));
        }else {
            System.out.println("wrong size");
        }




    }
}

   /* Write a Java program to test if the first or the last element of two array of integers are same.
   The length of the array must be greater than or equal to 2. Go to the editor
        Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
        array2 = 45, 20, 10, 20, 30, 50, 11
        Sample Output:

        false*/