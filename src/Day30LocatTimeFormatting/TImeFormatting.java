package Day30LocatTimeFormatting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TImeFormatting {
    public static void main(String[] args) {



        /*
        DateTimeFormatting:
        year:   yy, yyyy
        months: MM, MMM, MMMM
        days:   dd
        days name: E, EEEE

        hours: hh
        minutes: mm
        seconds: ss
        am/pm:  a

         */


        LocalTime time1=LocalTime.of(23,30);
        System.out.println(time1);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(time1.format(dtf));

        LocalTime time2 =LocalTime.of(10,0);
        System.out.println(time2.format(dtf));

        System.out.println(time1.isAfter(time2));


    }


}
