package Rephlits;

import java.util.Scanner;

public class Rephlit060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        /*
        Write a program that will verify if word contains in the sentence.
         Print out the result as boolean value.
         */
        String word = input.nextLine();
        String sentence = input.nextLine();

        boolean a = sentence.contains(word);
        System.out.println(a);


    }
}
