package Rephlits;

import java.util.Scanner;

public class RephlitOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  using the giving x and y int variables
        //  use operators to do math operations with the two variables.
        //  output the math operation results in this order:
        //plus,minus,multiply(*),divide(/) and modulo(%)
        //
        //use System.out.println to output the results.
        int x = 10;
        int y = 2 ;
        int plus = x+y;
        int minus = x-y;
        int multiply = x*y;
        int divide = x/y;
        int modulo = x%y;
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);
    }
}
