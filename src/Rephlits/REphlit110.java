package Rephlits;

import java.util.Scanner;

public class REphlit110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Given an int variable n that has already been declared
        and initialized to a positive value, and another
        int variable j that has already been declared, use a for loop
        to print a single line
        consisting of n asterisks. Thus if n contains 5,
         five asterisks will be printed.
        Use no variables other than n and j.
Example:
input: 1
output: *

Example:
input: 3
output: ***
         */
        int n = input.nextInt();

        for (int j =0; j<n;j++){
            String result = "*";
                System.out.print(result);
            }





    }
}
