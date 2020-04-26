package Day30LocatTimeFormatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        LocalDateTime dt =LocalDateTime.now();
        System.out.println(dt);

        LocalDateTime sbc=LocalDateTime.of(1993,8,18,5,20,30);

        System.out.println(sbc);

        //or you can do it this way

        LocalDate a1=LocalDate.of(1993,8,18);
        LocalTime a2=LocalTime.of(5,20,30);
        LocalDateTime a3=LocalDateTime.of(a1,a2);
        System.out.println(a3);

        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(a1.format(dtf));
    }
}
