package Day18Array;

public class Warmup1 {
    public static void main(String[] args) {
        /*
        1. write a program that can return the
        unique characters from a stringEx:  "AABCC" ==> "B"
         */

        String given = "AABCC";
        String result="";
        for (int k=0;k<=given.length()-1;k++) {
            int count=0;

            for (int i = 0; i <= given.length()-1; i++) {
                if (given.charAt(i) ==given.charAt(k)){
                    count++; } }
            if (count==1){
                result+=given.charAt(k); }

    }
        System.out.println(result);
}}
