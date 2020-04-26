package Rephlits;

import Day18Array.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";

        /*
        Given a String variable sentence,
        write code to get each word and
        assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
         */
        String [] abc=sentence.split(" ");
        String [] aaa=new String[abc.length];
        int k=abc.length-1;
        for (int i =0;i<abc.length;i++){
            aaa[i]=abc[k];
            k--;
        }

        for (int i =0;i<aaa.length;i++){
            reversed+=aaa[i]+" ";
        }
        reversed=reversed.trim();
        System.out.println(reversed);

    }
}
