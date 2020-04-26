package Day24Method_Overloading;

import java.util.Scanner;

public class WarmupFrequency {
    /*
    write a method that can find
    the frequency of characters in String
    Ex: "XXXYYZZZ"
    output : X3Y2Z3
     */
    public static void main(String[] args) {


        String a = "AAABBBBBCC";
        String empty = "";
        for (int i = 0; i < a.length(); i++) {
            if (!empty.contains(a.substring(i, i + 1))) {
                empty += a.substring(i, i + 1); } }
        String result = "";
        for (int k = 0; k < empty.length(); k++) {
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.substring(i, i + 1).equals(empty.substring(k,k+1))) {
                count++; }}
            result+=empty.substring(k,k+1)+count; }
        System.out.println(result);

        //second explenation





    }
}
