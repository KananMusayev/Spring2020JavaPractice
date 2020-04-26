package Rephlits;

import java.util.Scanner;

public class Rephlit153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        for (int k = 0; k < words.length; k++) {
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(words[k])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(words[k]);
            }
        }


    }}
