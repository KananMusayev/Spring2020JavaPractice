package Rephlits;

import java.util.Arrays;

public class Rephlit113 {
    public static void main(String[] args) {
        /*
        Write a for loop that prints all the
        even integers from 80 through 20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP
         */


        int num[]=new int[61];

        int k=0;
        for (int i =80;i>=20;i--){
                num[k]=i;
                k++; }

        for (int each:num){
            if (each%2==0){
                System.out.print(each+" ");
            }
        }

    }
}
