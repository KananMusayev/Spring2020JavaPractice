package Day51Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice1 {


    public static void main(String[] args) {

    /*
    Write a program that can remove duplicated characters from String
     */
        String a = "ABABABCDEF";
        String arr[]=a.split("");
        a="";

        for (String each:new LinkedHashSet<>(Arrays.asList(arr))){
            a+=each;
        }
        System.out.println(a);





    /*
        String a = "ABABABCDEF";

        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i=0;i<a.length();i++){
            set.add(a.substring(i,i+1));
        }
        a="";
        ArrayList<String >herfler=new ArrayList<>(set);
            for (int i=0;i<set.size();i++){
                a+=herfler.get(i);
            }
        System.out.println(a);


     */


    /*
    Write a program that can identify if two strings are build out of same letters
     */
        String str1="abababa";
        String str2="ab";

        str1=new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2=new TreeSet<>(Arrays.asList(str2.split(""))).toString();
        System.out.println(str1.equals(str2));



        /* MUHTARS SOLUTION (longer but understandable)

        String STR1[]=str1.split("");
        String STR2[]=str2.split("");

        TreeSet<String >t1=new TreeSet<>(Arrays.asList(STR1));
        TreeSet<String >t2=new TreeSet<>(Arrays.asList(STR2));

        str1=t1.toString();
        str2=t2.toString();
        System.out.println(str1.equals(str2));






        /*  THIS WAS MY OWN SOLUTION
        TreeSet<String > set1=new TreeSet<>();
        for (int i=0;i<str1.length();i++){
            set1.add(str1.substring(i,i+1));
        }
        TreeSet<String >set2=new TreeSet<>();
        for (int i=0;i<str2.length();i++){
            set2.add(str2.substring(i,i+1));
        }
        str1="";
        str2="";

        ArrayList <String > list=new ArrayList<>(set1);
        ArrayList <String > lis2=new ArrayList<>(set2);

        for (int i=0;i<list.size();i++){
            str1+=list.get(i);
            str2+=lis2.get(i);
        }
        boolean result=str1.equals(str2);
        System.out.println(result);

         */


    }
}
