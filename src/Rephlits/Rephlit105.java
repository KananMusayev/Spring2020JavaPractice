package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit105 {
    public static void main(String[] args) {
        /*
        Given a String array words,
        iterate through each word and
         print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
         */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String[] empty=new String[words.length];
        for (int i=0;i<words.length;i++ ){
            empty[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);


        }
        System.out.println(Arrays.toString(empty));

    }
}
