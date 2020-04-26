package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit106 {
    public static void main(String[] args) {
        /*
        Given a String variable sentence,
         write code to type each word in separate lines.
Example:
sentence -> "Java is fun"
Print
Java
is
fun
         */
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String []abc=sentence.split(" ");
        for (int i =0;i<abc.length;i++){
            System.out.println(abc[i]);
        }




    }
}
