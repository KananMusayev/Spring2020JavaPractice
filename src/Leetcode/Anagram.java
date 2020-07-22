package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

    public static void main(String[] args) {

/*
Given two strings s and t ,
write a function to determine if t is an anagram of s.
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */
        System.out.println(isAnagram("a","ab"));    }
    public static boolean isAnagram(String s, String t) {

        ArrayList<String >listS=new ArrayList<>();
        ArrayList<String >listT=new ArrayList<>();
        boolean isanagram=false;

        if (s.length()==t.length()) {
            for (int i =0; i < s.length(); i++) {
                listS.add(s.substring(i,i+1));
                listT.add(t.substring(i,i+1));
            }
            Collections.sort(listS);
            Collections.sort(listT);
            s="";
            t="";
            for (int i=0;i<listS.size();i++){
                s+=listS.get(i);
                t+=listT.get(i);
            }
            if (s.equals(t)){
                isanagram=true;
            }
        }
        return isanagram;
    }



}
