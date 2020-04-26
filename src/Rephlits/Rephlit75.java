package Rephlits;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Rephlit75 {
    public static void main(String[] args) {

        /*
        Given a string word, if the first or last chars are 'x' or 'X',
         print the string without those 'x' or 'X' chars,
         otherwise print the string unchanged.
         Example:
            input: xHiX
            output: Hi
         */

        String word = "redX";
        String empty="";


        boolean firstpart =word.startsWith("x")||word.startsWith("X");
        boolean secondpart = word.endsWith("x")||word.endsWith("X");
        if (firstpart||secondpart){
            System.out.println(word.replace("x","").replace("X","")); }
        else {
            System.out.println(word);
        }


        /*

        boolean firstpart =word.startsWith("x")||word.startsWith("x");
        boolean secondpart = word.endsWith("X")||word.endsWith("X");
        if (firstpart||secondpart){
            System.out.println(word.replace("x","").replace("X","")); }
        else {
            System.out.println(word);
        }
         */
    }
}
