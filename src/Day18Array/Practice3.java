package Day18Array;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user to enter 5 names and return the longest name
        do it with the Array
         */

     String [] names ={"Seyfo","Asiya","Myra","Keteryna","Daulet",
             "vladislav zakharovich skorobogotko"};
     int max =0;
     String LongestName="";
     for (int i =0;i<names.length;i++){
         if (names[i].length()>max){
             max=names[i].length();
             LongestName=names[i]; } }

        System.out.println(LongestName);
    }
}
