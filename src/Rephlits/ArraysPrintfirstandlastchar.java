package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintfirstandlastchar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        /*
        Given a String array words, iterate through
        each word and print first and last letter
        of each element in separate lines.
Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
         */
        String words1[]={"hello", "why", "by", "apple" , "note"};
        for (int i =0;i<words1.length;i++){
            System.out.println(words1[i].charAt(0)+""+words1[i].charAt(words1[i].length()-1));
        }
    }
}
