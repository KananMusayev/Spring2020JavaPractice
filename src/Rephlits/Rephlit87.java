package Rephlits;

import java.util.Scanner;

public class Rephlit87 {
    public static void main(String[] args) {
        /*
           Given a string word, print true if "java"
           appears starting at index 0 or 1 in the string,
            such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
            The string may be any length, including 0word = .
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length()<4){
            System.out.println("false");
        }
        else if (word.length()>=4&&word.startsWith("java")||word.substring(1).startsWith("java")){

            System.out.println("true"); }

        else {
            System.out.println("false");
        }



    }
}
