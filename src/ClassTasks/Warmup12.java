package ClassTasks;

import java.util.Scanner;

public class Warmup12 {
    public static void main(String[] args) {
        /*
        write a program that can ask the user
        to "enter a word" five times and returns
        the word that has the maximum length
         */
        Scanner input =new Scanner (System.in);
        int max =0;
        String result="";
        for (int i=1;i<=5;i++){
            System.out.println("Please enter a word");
            String word = input.nextLine();
            if (word.length()>result.length()){

                result=word;} }
        System.out.println(result);
    }
}
