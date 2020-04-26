package Day29LocalDataandTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        /*
        LocalDate: used for creating date (year months date)
         */

        LocalDate date1=LocalDate.of(2020,10,25);
        System.out.println(date1);

        LocalDate birthdate =LocalDate.of(1993,8,18);
        System.out.println(birthdate);
        /*
        Methods:   all of them returns boolean
        isAfter():
        isBefore():
        isEqual():
        isLeapyear:
         */

        //isAfter
        boolean result1=date1.isAfter(birthdate);
        System.out.println(result1);

        //isBefore

        boolean result2=date1.isBefore(birthdate);
        System.out.println(result2);

        //isEqual

        boolean result3=date1.isEqual(birthdate);
        System.out.println(result3);

        //isLeapYear

        boolean result4=birthdate.isLeapYear();
        System.out.println(result4);


        System.out.println("================================================");

        LocalDate now=LocalDate.now();//2020 04-24
        System.out.println(now);

        String str =now.toString();
        System.out.println(str);







    }
}
