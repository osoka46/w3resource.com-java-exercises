import java.util.Scanner;

public class Question67 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String text1,middleText;
        System.out.println("type a text with 2 word");

        text1=input.nextLine();
        System.out.println("type middle word");
        middleText=input.nextLine();

        String []arr=text1.split(" ",0);
       for(int x=0;x<arr.length;x++)
       {
           if (x==1)
           {
               System.out.print(" "+middleText+" ");
           }
           System.out.print(arr[x]);
       }


    }
}

  /*  Write a Java program to insert a word in the middle of the another string. Go to the editor
Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
        Sample Output:

        Python Tutorial 3.0*/