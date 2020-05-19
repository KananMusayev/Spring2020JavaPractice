package ClassTasks;

import java.util.ArrayList;
import java.util.Collections;

public class sdskhg {
    public static void main(String[] args) {


       // Input:  "DC501GCCCA098911"

       // OutPut: "CD015ACCCG011899"

        String given="DC501GCCCA098911";
        ArrayList<Character> total=new ArrayList<>();
        for (int i=0;i<given.length();i++){
            total.add(given.charAt(i));
        }

        ArrayList<Integer> digits=new ArrayList<>();
        ArrayList<String > alphabets=new ArrayList<>();
        String result="";
//        String given="DC501GCCCA098911";
        for (int i=0;i<given.length();i++){
            if (Character.isDigit(total.get(i))){
                digits.add(Integer.parseInt(given.substring(i,i+1)));

            }
        }




    }}
