package ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class taskfejhvfelvj {


    public static void main(String[] args) {


    String a="a2b5c7a9f0dafa2s6a8d5a";
    char[]b=a.toCharArray();
    String c="";
    for (int i=0;i<a.length();i++){
        if (Character.isAlphabetic(a.charAt(i))&&a.substring(i,i+1).equals("a")){
            c+=a.substring(i,i+1);
        }
    }
       for (int i=0;i<a.length();i++){
           if (!a.substring(i,i+1).equals("a")){
               c+=a.substring(i,i+1);
           }
       }
        System.out.println(c);








/*
        ArrayList<String>a=new ArrayList<>(Arrays.asList("aaa","bbb"));
        ArrayList<String>b=new ArrayList<>(Arrays.asList("ccc","ddd","fff","kkk"));
        ArrayList<String>c=new ArrayList<>();
        int k=0;
        int z=1;
        for (int i=0;i<a.size()+b.size();i++){
            if (a.size()>i){
            c.add(a.get(k));}
            if (b.size()>i){
            c.add(b.get(z));}
            k+=2;
            z+=2;
            System.out.println(c);
        }
        System.out.println(c);


 */

    }
}
