package ClassTasks;

import java.util.Arrays;

public class Task2 {




    public static boolean method(String a,String c){
        char[]k=a.toCharArray();
        char[]z=c.toCharArray();
        Arrays.sort(k);
        Arrays.sort(z);
        a="";
        c="";

        for (int i=0;i<z.length;i++){

            a+=k[i];
            c+=z[i];
        }

        boolean result=false;
        if (a.equals(c)){
            result=true;
        }
    return result;


    }
    public static void main(String[] args) {



    /*
    Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
     */

String a="acd";
String c="cab";
        System.out.println(method(a,c));
char[]k=a.toCharArray();
char[]z=c.toCharArray();
Arrays.sort(k);
Arrays.sort(z);
        a="";
        c="";

        for (int i=0;i<z.length;i++){

            a+=k[i];
            c+=z[i];
        }

        boolean result=false;
        if (a.equals(c)){
            result=true;
        }
        System.out.println("result = " + result);



    }
}
