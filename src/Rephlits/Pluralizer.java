package Rephlits;

import java.util.Scanner;

public class Pluralizer {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();

    if (amt>1||amt==0) {

        if (word.endsWith("fe")) {
            word = word.substring(0, word.length() - 2);
            System.out.println(amt + " " + word + "ves");
        } else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
            System.out.println(amt + " " + word + "s");
        } else if (!word.endsWith("ay") && !word.endsWith("oy") && !word.endsWith("ey") && !word.endsWith("uy") && word.endsWith("y")) {
            word = word.substring(0, word.length() - 1);
            System.out.println(amt + " " + word + "ies");
        } else if (word.endsWith("ch") || word.endsWith("sh")) {
            System.out.println(amt + " " + word + "es");

        } else if (word.endsWith("us")) {
            word = word.substring(0, word.length() - 2);
            System.out.println(amt + " " + word + "i");

        } else {
            System.out.println(amt +" "+ word + "s");
        }
    }
    else {
        System.out.println(amt+" "+word);

    }
}}
