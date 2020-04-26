package ClassTasks;

import java.util.Scanner;

public class Maximumlengthofword {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*
        write a program that can ask the user
        to "enter a word" five times and returns
        the word that has the maximum length
         */
        int max=0;
        String empty="";
        for (int i=0;i<5;i++) {
            System.out.println("enter a word");
            String word = input.next();
            if (word.length() > max) {
                max = word.length();
                empty = word;
            }
        }

        System.out.println(empty);
    }
}
