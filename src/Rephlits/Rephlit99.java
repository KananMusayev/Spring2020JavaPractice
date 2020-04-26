package Rephlits;

import java.util.Scanner;

public class Rephlit99 {
    public static void main(String[] args) {
        /*
        Example:
input: abcXXXabc
output: 1

Example:
input: xxxabyyyycd
output: 3

Example:
input: java
output: 0

input: xxxabyyyycd

         */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        for (int i=0;i<str.length()-2;i++){
            if (str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
                count++;
            }
        }
        System.out.println(count);
    }
}
