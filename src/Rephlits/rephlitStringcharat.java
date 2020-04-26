package Rephlits;

import java.util.Scanner;

public class rephlitStringcharat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        using charAt method output the 5th letter of
        txt string then the 6th letter then the 6th letter.

use print not println.

         */

        String txt = input.nextLine();
        System.out.print(txt.charAt(4));
        System.out.print(txt.charAt(5));
        System.out.print(txt.charAt(5));
    }
}
