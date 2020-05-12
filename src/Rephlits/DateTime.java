package Rephlits;

import java.util.ArrayList;
import java.util.Arrays;

public class DateTime {
    public static void main(String[] args) {

        //aaabbbcdd
        //a3b3c1d2
        String a="aaabbbcdd";
        String nondup="";

        for (int i=0;i<a.length();i++){
            if (!nondup.contains(a.substring(i,i+1))){
                nondup+=a.substring(i,i+1);
            }
        }
        String result="";
        for (int k=0;k<nondup.length();k++) {
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i)==nondup.charAt(k)){
                        count++;
                    }
            }
            result+=nondup.charAt(k)+""+count;

        }
        System.out.println(result);



    }

    public static void timeConversion(String s) {


        if (s.equals("12:00:00AM")){{
            System.out.println("00:00:00");
        }


        }
    }

    }
