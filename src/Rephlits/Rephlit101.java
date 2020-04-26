package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit101 {
    public static void main(String[] args) {
        /*
        words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
         */
        Scanner input = new Scanner(System.in);
        String[] words = {"hello","why","by","apple","note"};

        String[] empty=new String[words.length];
        for (int i=0;i<words.length;i++ ){
            System.out.println(words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
        }



    }

}
