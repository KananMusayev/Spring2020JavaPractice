package Rephlits;

import java.util.Scanner;

public class Assestment1point4 {
    public static void main(String[] args) {
        double cal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        int weight1 = scan.nextInt();
        double weightinkg=weight1/2.2;
        int runningperminutewith6mileshour =10;
        int basketballperminute=8;
        int sleepingperminute=1;
        int minutesforrunning =30;
        int minutesforbasketball=30;
        int minutesforsleeping=360;
        int totalmets =minutesforrunning*10+minutesforbasketball*basketballperminute+minutesforsleeping*sleepingperminute;
        double calori =0.0175;
        double calories=calori*totalmets*weightinkg;
        int result=(int) calories;
        System.out.println("Calories Burned: "+result );

    }
}
