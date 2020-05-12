package InteviewquestionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class SameLetters {
    public static void main(String[] args) {
        /*
        String -- Same letters
Write a return method that check if a string is build
out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
         */

        String a="abc";
        String b="cab";

        boolean result=false;

ArrayList<String> A=new ArrayList<>();
ArrayList<String> B=new ArrayList<>();
for (int i=0;i<a.length();i++){
    A.add(a.substring(i,i+1));
    B.add(b.substring(i,i+1));
}

        Collections.sort(B);
        Collections.sort(A);

        String AA="";
        String BB="";

        for (int i=0;i<B.size();i++){
            AA+=A.get(i);
            BB+=B.get(i);
        }
        if (AA.equals(BB)){
            result=true;
        }
        System.out.println(result);


    }
}
