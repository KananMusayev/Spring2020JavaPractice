package Rephlits;

import java.util.Scanner;

public class Rephlit30 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        String empty="";

        for (int i=s.length()-1;i>=0;i--){
            empty+=s.charAt(i);
        }
        System.out.println(empty);


    }
}
