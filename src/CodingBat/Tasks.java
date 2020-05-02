package CodingBat;

import Day25ListWrapperclass.ArraylistVSArray;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

/*
write a return method that can remove the duplicated values from a string
Ex:removeDup("AAABBBCCC")==> ABC
 */
String a="AAABBBCCC";
String c="";
for (int i=0;i<a.length();i++){
    if (!c.contains(a.substring(i,i+1))){
        c+=a.substring(i,i+1);
    }
}
        System.out.println(c);


        System.out.println(unique("AAABBBCCCDEF"));
        System.out.println(frequency("AAABBCDD"));
/*
Write a return method that can find the unique characters from the string
Ex:"AAABBBCCCDEF" ==>DEF
 */


    }
    public static String unique(String a) {
        String result="";
        for (int z = 0; z < a.length(); z++) {
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.substring(i,i+1).equals(a.substring(z,z+1))){
                    count++;
                }
            }
            if (count==1){
                result+=a.substring(z,z+1);
            }
        }
        return result;
    }

    public static String frequency (String a) {
        String result="";

        ArrayList<String > b=new ArrayList<>();
        for (int i=0;i<a.length();i++){
            b.add(a.substring(i,i+1)); }

        for (int i=0;i<b.size();i++){
            int count=Collections.frequency(b,b.get(i));
            if (!result.contains(b.get(i))){
            result+=b.get(i);
            result+=count;}
        }
        return result;

    /*
    Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    }
}
