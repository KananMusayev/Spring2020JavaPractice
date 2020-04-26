package Rephlits;

import java.util.Scanner;

public class Rephlit97 {
    public static void main(String[] args) {
        /*
        Given a string, print out true if the number
        of appearances of "java" anywhere in the
        string is equal to the number of appearances
        of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
         */
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int javacount=0;
        int phythoncount=0;
        for (int i=0;i<sentence.length()-3;i++){
            if (sentence.substring(i,i+4).equals("java")){
                javacount++; }}
        for (int i=0;i<sentence.length()-5;i++){
            if (sentence.substring(i,i+6).equals("python")){
                phythoncount++; } }
        if (javacount==phythoncount){
            System.out.println(true); }
        else if (javacount!=phythoncount){
            System.out.println(false);
        }
    }
}
