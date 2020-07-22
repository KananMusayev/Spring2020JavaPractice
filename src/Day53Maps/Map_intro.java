package Day53Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_intro {

    public static void main(String[] args) {

        Map<String ,Double>employeeInfo=new LinkedHashMap<>();

        employeeInfo.put("Zarina",120000.0);
        employeeInfo.put("Esmira",150000.0);
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        System.out.println(employeeInfo.get("Zarina"));
        System.out.println(employeeInfo.get("Esmira"));

        //employeeInfo.remove("Zarina");
        System.out.println(employeeInfo);


        employeeInfo.put("Zarina",130000.0);
        System.out.println(employeeInfo);

        Map<String , LocalDate> birdtdays=new LinkedHashMap<>();
        birdtdays.put("Kenan",LocalDate.of(1992,06,7));
        birdtdays.put("Alisa",LocalDate.of(2019,8,13));
        birdtdays.put("Esmira",LocalDate.of(1993,7,11));
        birdtdays.put("Senan",LocalDate.of(2003,3,18));
        birdtdays.put("Nicat",LocalDate.of(1989,4,20));
        birdtdays.put("Mishi",LocalDate.of(2019,8,13));
        //we can have duplicated values : Line 34 and 30
        birdtdays.put("Kenan",LocalDate.of(1993,8,18));
        //we can NOT have duplicated keys and in this case it takes the last added keys value
        System.out.println(birdtdays);


    }
}
