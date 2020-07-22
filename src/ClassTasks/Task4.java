package ClassTasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {

    public static String method(String a){
        String resutl="";

        for (int i=0;i<a.length();i++){
            int count=0;
            for (int k=0;k<a.length();k++){
                if (a.substring(i,i+1).equals(a.substring(k,k+1))){
                    count++;
                }
            }
            if (count==1){
                resutl+=a.substring(i,i+1);
            }
        }
        return resutl;



    }



    public static void main(String[] args) {


        System.out.println(method("AAABBBCCCDEF"));
   /*
   String -- Find the unique
Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    */

 String a="AAABBBCCCDEF" ;
String resutl="";

       for (int i=0;i<a.length();i++){
           int count=0;
           for (int k=0;k<a.length();k++){
               if (a.substring(i,i+1).equals(a.substring(k,k+1))){
                   count++;
               }
           }
           if (count==1){
               resutl+=a.substring(i,i+1);
           }
       }
        System.out.println(resutl);


    }
}
