package Day29LocalDataandTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatesFormatting {
    public static void main(String[] args) {

        //pattern types
        //year ==> yy or yyyy
        //month==> MM or MMM or MMMM
        //days==> dd
        //weekdays name==>EEE (first 3 letters of the days) or EEEE(full name) and
        // u add it in the beginning of the patterns
        //u can give one E as well it will show first 3 letters

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEE yyyy/MM/dd");
        //you can change the patterns like mm first or days first and so on
        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEE MM/dd/yyyy");
        //and when u give MMM it will write the month's 3 letters and
        // when u give MMMM then it will be the whole name
        LocalDate date2=LocalDate.now();
        System.out.println(date2.format(dtf2));
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("EEE MMM/dd/yyyy");
        LocalDate date3=LocalDate.now();
        System.out.println(date3.format(dtf3));

        /*
        create a date called Birthday:month/Days/year
        ex: 2020/04/23
        output: Apr/23/20
         */
        DateTimeFormatter abc=DateTimeFormatter.ofPattern("EEE MMM/dd/yy");
        LocalDate birthday=LocalDate.of(1993,8,18);
        System.out.println(birthday.format(abc));





        LocalDate vaxt=LocalDate.of(1970,9,25);
        DateTimeFormatter aaa=DateTimeFormatter.ofPattern("EEEE MM/dd/yyyy");
        System.out.println(vaxt.format(aaa));







    }
}
