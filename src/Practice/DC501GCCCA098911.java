package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class DC501GCCCA098911 {

    public static void main(String[] args) {

        /*
String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together

Ex:

Input:  "DC501GCCCA098911"

OutPut: "CD015ACCCG011899"

         */
      String a="DC501GCCCA098911";

        ArrayList<String >List=new ArrayList<>();
        String result="";

      for (int i=0;i<a.length();i++){
          if (Character.isDigit(a.charAt(i))){
              List.add(a.charAt(i)+"");
              if (i+1==a.length()){
                  Collections.sort(List);
                  for (int k=0;k<List.size();k++){
                      result+=List.get(k);
              }break;}
              if (!Character.isDigit(a.charAt(i+1))){
                  Collections.sort(List);
                  for (int k=0;k<List.size();k++){
                      result+=List.get(k);
                      if (k+1==List.size()){
                          List.clear();
                      }
                  }
              }
          }
          else if (Character.isAlphabetic(a.charAt(i))){
              List.add(a.charAt(i)+"");
              if (i+1==a.length()){
                  Collections.sort(List);
                  for (int k=0;k<List.size();k++){
                      result+=List.get(k);
                  }break;}
              if (!Character.isAlphabetic(a.charAt(i+1))){
                  Collections.sort(List);
                  for (int z=0;z<List.size();z++){
                      result+=List.get(z);
                      if (z+1==List.size()){
                          List.clear();
                      }
                  }
              }
          }
      }

          System.out.println(result);










    }

}
