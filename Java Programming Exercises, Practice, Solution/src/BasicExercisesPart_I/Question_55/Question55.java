import java.util.Scanner;

public class Question55 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int second;
        int hour;
        int minute;

        System.out.println("type second");
        second= input.nextInt();

        hour=second/3600;

        minute=(second-hour*3600)/60;

        second=second-hour*3600-minute*60;

        System.out.println(hour+":"+minute+":"+second);



    }
}
/*

    Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
        Sample Output:

        Input seconds: 86399
        23:59:59*/
