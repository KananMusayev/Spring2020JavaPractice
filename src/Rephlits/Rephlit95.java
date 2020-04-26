package Rephlits;

import java.util.Scanner;

public class Rephlit95 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        //xxbreadbreadjambread
        int numbread=0;
        for (int i=0;i<str.length()-4;i++){
            if (str.substring(i,i+5).equalsIgnoreCase("bread")){
                numbread++; } }
        if (numbread>=2){
            System.out.println(str.substring(str.indexOf("d")+1,str.lastIndexOf("bread")));
        }
        else {
            System.out.println("nothing");
        }


    }
}
