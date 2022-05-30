import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Question47 {
    public static void main(String[] args) {

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        date.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println(date.format(System.currentTimeMillis()));
    }
}

   /* Write a Java program to display the current date time in specific format. Go to the editor
    Sample Output:

        Now: 2017/06/16 08:52:03.066 */