package Rephlits;

import java.util.Scanner;

public class Rephlit84 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
       /*
        int day=0;

        while (inhabitants>0){
            System.out.println("Day "+day+" ["+inhabitants+"]");
            inhabitants=inhabitants/2;
            day++;
        }
        */







        int day=0;
        for (int i=0;i<inhabitants;i++){
            System.out.println("Day "+day+" ["+inhabitants+"]");
            inhabitants=inhabitants/2;
            day++;
            }
        System.out.println("---- EXTINCT ----");



    }
}
