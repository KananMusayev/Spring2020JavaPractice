package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit102 {
    public static void main(String[] args) {
        /*
        Given a String variable sentence,
        write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
         */

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
       String [] abc=sentence.split(" ");
       String []aaa=new String[abc.length];
       int a=abc.length-1;
        for (int i =0;i<abc.length;i++){
           aaa[i]=abc[a];
           a--;
        }
        for (int i=0;i<aaa.length;i++){
            System.out.println(aaa[i]);
        }

    }
}
