package Rephlits;

import java.util.Scanner;

public class REphlit010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Given a String (already declared for you as str),
        do the following:
Print out the following: "The first 3 letters of ___ is ___"

For example, if the input is "banana", your output should be
"The first 3 letters of banana is ban"
         */
        String str = input.nextLine();
        String a=str.substring(0,2);
        System.out.println("The first 3 letters of "+str+"is "+a);
        String b = "kenan";
        System.out.println(b.substring(0,2));

        System.out.print("In:");

    }
}
