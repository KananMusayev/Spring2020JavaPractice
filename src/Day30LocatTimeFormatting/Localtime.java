package Day30LocatTimeFormatting;

import java.time.LocalTime;

public class Localtime {
    public static void main(String[] args) {


        LocalTime time1=LocalTime.now();
        System.out.println(time1);

        LocalTime time2=LocalTime.of(15,30,45);
        System.out.println(time2);
    }


}
