package Rephlits;

import java.util.Scanner;

public class Rephlit86 {
    public static void main(String[] args) {
         /*
        Print true if the string "cat" and "dog" appear
        the same number of times in the given string word.
Example:
input: catdog
output: true
Example:
input: catcat
output: false
Example:
input: cat-cheetah-dog-cat
output: false
         */

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for (int i=0;i<word.length()-2;i++){
            if (word.substring(i,i+3).equals("cat")){
                countOfCats++; }
            else if (word.substring(i,i+3).equals("dog")){
                countOfDogs++; } }
        if (countOfCats==countOfDogs){
            System.out.println(true); }
        else if (countOfCats!=countOfDogs){
            System.out.println(false);
        }
    }
}
