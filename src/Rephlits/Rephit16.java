package Rephlits;

import java.util.Scanner;

public class Rephit16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*  The variable "num" holds an integer user input

Write a conditional statement starting on line 9 that does the following:
If num is even (divisible by 2), print "__ is even"
If num is odd, print "__ is odd"

Examples:
In: 23
23 is odd
In: 36
36 is even
         */
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "is even");
        } else if (num % 2 == 1) {
            System.out.println(num + " is odd");
        }
    }
}