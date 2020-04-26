package Day20ForEachLoopAndContinueStatement;

import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {
        /*
        write a program that can check
        if two strings are build out of same letters
        Ex:
        str1="aabbbc"; str2="cab"
        output ->true

        if
        str1="abcd" str2="abc"
        output -> false;
        Hint :need array and arrays methods;

         */
        String a="aabbbce";
        String b="cabbccaabbbaa";
        String empty="";
        for (int k=0;k<a.length();k++){
        for (int i=0;i<a.length();i++){
            if (!empty.contains(a.substring(k,k+1))){
                empty+=a.charAt(k); } } }


        System.out.println(empty);


        String bosh="";

            for (int i = 0; i < b.length(); i++) {
                if (!bosh.contains(""+b.charAt(i))){
                    bosh+=b.charAt(i);
                }


        }
        System.out.println(bosh);


            //now empty ==abc
            //and bosh==cab

            String [] Result1=empty.split("");
            String [] Result2=bosh.split("");
            Arrays.sort(Result1);
            Arrays.sort(Result2);
        System.out.println(Arrays.toString(Result1));
        System.out.println(Arrays.toString(Result2));
        String cavab1= Arrays.toString(Result1);
        String cavab2=Arrays.toString(Result2);
        if (cavab1.equals(cavab2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }













        /*
        char[] Result1=empty.toCharArray();
        char[] Result2=bosh.toCharArray();
                Arrays.sort(Result1);
                Arrays.sort(Result2);
        System.out.println(Arrays.toString(Result1));
        System.out.println(Arrays.toString(Result2));

         */







    }}
