package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit22 {
    public static void main(String[] args) {
        /*
        String word;

Write a for loop that will print
out every other letter in a String,
 starting with the first letter.
 These letters should be printed
 all on one line with no space in between.

Sample input/outputs
In: hello
hlo
In: so code very wow
s oevr o
         */
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i=0;i<word.length();i++){
            if (i%2==0){
                System.out.println(word.charAt(i));
            }
        }
    }
}
