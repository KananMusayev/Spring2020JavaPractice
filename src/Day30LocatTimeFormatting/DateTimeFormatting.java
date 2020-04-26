package Day30LocatTimeFormatting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatting {
    public static void main(String[] args) {

        LocalDateTime dateTime1=LocalDateTime.of(2015,12,25,11,30,45);

        DateTimeFormatter abc= DateTimeFormatter.ofPattern("E MM/dd/YYYY hh:mm a");
        System.out.println(dateTime1.format(abc));



    }
}
