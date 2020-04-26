package Rephlits;

public class Rephlit_56 {
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc",'c'));
    }
    public static String surround(String s,char search_term) {
        String a="("+search_term+")";
        if (s.contains(search_term+"")) {
            s = s.replaceAll(search_term+"",a); }

        return s;
    }
}
