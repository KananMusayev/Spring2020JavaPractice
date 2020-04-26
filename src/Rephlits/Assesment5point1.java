package Rephlits;

import java.util.Scanner;

public class Assesment5point1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String result="";
        for (int i=0;i<word.length();i++){
            if (word.substring(i,i+1).equals("a")){
                result+="a"; }
            else if (word.substring(i,i+1).equals("e")){
                result+="e"; }
            else if (word.substring(i,i+1).equals("i")){
                result+="i"; }
            else if (word.substring(i,i+1).equals("o")){
                result+="o"; }
            else if (word.substring(i,i+1).equals("u")){
                result+="u"; } }
        System.out.println(result);

    }
}
