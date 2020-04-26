package Rephlits;

import java.util.Scanner;

public class Rephlit23 {
    public static void main(String[] args) {
        /*
        Write a for loop that will loop through
         every letter of the input and print out
          just the vowels. Sample input/outputs
In: howdyho
oo
         */
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String empty = "";
        String word = inp.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if ((word.substring(i, i + 1).equals("a"))) {
                empty += "a";
            } else if ((word.substring(i, i + 1).equals("e"))) {
                empty += "e";
            } else if ((word.substring(i, i + 1).equals("i"))) {
                empty += "i";
            } else if ((word.substring(i, i + 1).equals("o"))) {
                empty += "o";
            } else if ((word.substring(i, i + 1).equals("u"))) {
                empty += "u";
            }




        }
        System.out.println(empty);
    }
}
