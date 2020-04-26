package Rephlits;

public class Rephlit69 {
    public static void main(String[] args) {
        /*
        Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
         */
        String word = "java";
        int length=word.length();
        int a =length/2;

        System.out.println(word.substring(0,a)+word.substring(0,a));
    }
}
