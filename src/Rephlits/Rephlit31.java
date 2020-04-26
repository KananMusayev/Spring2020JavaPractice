package Rephlits;

import java.util.Scanner;

public class Rephlit31 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        /*
        In: powerful
            pOwErFuL
         */


        for (int i=0;i<s.length();i++) {
            String a=s.substring(i,i+1);
            if (i%2!=0){
                System.out.print(a.toUpperCase());
            }
            else if (i%2==0){
                System.out.print(a.toLowerCase());
            }

        }
    }
}
