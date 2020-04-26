package Rephlits;

import java.util.Scanner;

public class Rephilt35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        in this assignment you are given two string variables word1
        and word2.
you need to check if they are equal using an if.

Comparison should be case sensitive. "java" and "JaVa" are not equal.

if they are equal output  "word1 equals word2"
else output "word1 does not equal word2"

         */
        System.out.println("enter word one");
        String word1 = input.nextLine();
        System.out.println("enter word two");
        String word2 = input.nextLine();
        System.out.println("word1=");
        System.out.println("word2=");

        if (word1.equals(word2)){
            System.out.println("word1 equals word2"); }
        else {
            System.out.println("word1 does not equal word2"); }



    }
}
