package SpecialTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class StringsortnumbersandLetters {


    public static void main(String[] args) {
        /*
        Given alphanumeric String, we need to split the string into
        substrings of consecutive letters or numbers, sort the individual
        string and append them back together
Ex:
Input:  "DC501GCCCA098911"

OutPut: "CD015ACCCG011899"
         */
      String r="DC501GCCCA098911";

        ArrayList<String >alphabet=new ArrayList<>();
        ArrayList<String >nums=new ArrayList<>();
        ArrayList<String >Total=new ArrayList<>();


      for (int i=0;i<r.length();i++){

          if (Character.isAlphabetic(r.charAt(i))){
              alphabet.add(r.charAt(i)+"");
              if (i+1>=r.length()){
                  Collections.sort(alphabet);
                  Total.addAll(alphabet);
                break;
              }
              if (Character.isDigit(r.charAt(i+1))){
                  Collections.sort(alphabet);
                  Total.addAll(alphabet);
              }
          }
          else if (Character.isDigit(r.charAt(i))){
              nums.add(r.charAt(i)+"");
              if (i+1>=r.length()){
                  Collections.sort(nums);
                  Total.addAll(nums);
                  break;
              }
              if (Character.isAlphabetic(r.charAt(i+1))){
                  Collections.sort(nums);
                  Total.addAll(nums);
              }
          }
      }
      String Res="";
        for (int i=0;i<Total.size();i++){
            Res+=Total.get(i);
        }
        System.out.println(Res);


    }
}
