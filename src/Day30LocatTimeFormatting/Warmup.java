package Day30LocatTimeFormatting;

import java.time.LocalDate;

public class Warmup {
    public static void main(String[] args) {
        String []a={"Ali","Ahmet","arzu","dilqem","dilefruz"};
        LocalDate birthdayALi=LocalDate.of(1993,6,27);
        LocalDate birthdayAhmet=LocalDate.of(1995,7,22);
        LocalDate birthdayArzu=LocalDate.of(1996,2,13);
        LocalDate birthdaydilqem=LocalDate.of(1991,7,19);
        LocalDate birthdaydilefruz=LocalDate.of(1998,1,20);


        LocalDate[] birthdates={birthdayALi,birthdayAhmet,birthdayArzu,birthdaydilqem,birthdaydilefruz};

        for (int i=0;i<a.length;i++){
            String ad=a[i];
            LocalDate bd =birthdates[i];
            System.out.println(ad+"'s birthday is on "+bd);
        }

    }
}
