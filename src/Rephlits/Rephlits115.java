package Rephlits;

import java.util.Scanner;

public class Rephlits115 {
    public static void main(String[] args) {
        /*
        Given the array words, it will print
        the word with the largest length.
         Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
         */
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();}

            int max = 0;
        String result="";
            for (int k = 0; k < words.length; k++) {
                if (words[k].length() > max) {
                    max=words[k].length();
                    result = words[k];
                }}
                System.out.println(result);




        }
    }

