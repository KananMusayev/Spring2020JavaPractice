package ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Review {


    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static void main(String[] args) {


        String a="AAABBBCCC";

        String b="";
        for (int i=0;i<a.length();i++){
            if (!b.contains(a.substring(i,i+1))){
                b+=a.substring(i,i+1);
            }
        }
        System.out.println("b = " + b);




        String t="AAABBBCCC";

        LinkedHashSet set=new LinkedHashSet();
        
        
        for (int i=0;i<t.length();i++){
            set.add(t.substring(i,i+1));
        }
        System.out.println("set = " + set);


        System.out.println("==========================================================");


        /*
        String -- Frequency of Characters
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

solution 1:
         */



        String z="AAABBCDD";

        String k="";

        for (int i=0;i<z.length();i++){
            if (!k.contains(z.substring(i,i+1))){
                k+=z.substring(i,i+1);
            }
        }
        System.out.println(k);
        String result="";

        for (int i=0;i<k.length();i++){
            int count=0;
            for (int h=0;h<z.length();h++){
                if (k.substring(i,i+1).equals(z.substring(h,h+1))){
                    count++;
                }
            }
            result+=k.substring(i,i+1)+count;
        }
        System.out.println("result = " + result);


        /*
        Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
         */

        String AA="abcaac";
        String BB="cabbb";

        String kk=new TreeSet<String >(Arrays.asList(AA.split(""))).toString();
        String zz=new TreeSet<String >(Arrays.asList(BB.split(""))).toString();
        System.out.println(kk);
        System.out.println(zz);



        TreeSet<String > treeSetA=new TreeSet<>();
        TreeSet<String > treeSetB=new TreeSet<>();

        for (int i=0;i<AA.length();i++){
            treeSetA.add(AA.substring(i,i+1));
        }
        for (int i=0;i<BB.length();i++){
            treeSetB.add(BB.substring(i,i+1));
        }

        System.out.println("treeSetB = " + treeSetB);
        System.out.println("treeSetA = " + treeSetA);
            boolean result1=false;
        String A1="";
        String A2="";

        ArrayList<String >arrayListA=new ArrayList<>(treeSetA);
        ArrayList<String >arrayListB=new ArrayList<>(treeSetB);

        for (int i=0;i<arrayListA.size();i++){
            A1+=arrayListA.get(i);
            A2+=arrayListB.get(i);
        }
        if (A1.equals(A2)){
            result1=true;
        }
        System.out.println(result1);
        System.out.println("==========================================================");


        /*
        Reverse a string for me
                         */

        String w="java";
        String ww="";
        for (int i=w.length()-1;i>=0;i--){
            ww+=w.substring(i,i+1);
        }
        System.out.println(ww);



        /*
                Sum of digits in a string
         */

        String tt="fhier217n543bj53h64j64";

        int q=0;
        for (int i=0;i<tt.length();i++){

          if (Character.isDigit(tt.charAt(i))){
              q+=Integer.parseInt(tt.charAt(i)+"");
          }

        }
        System.out.println(q);
    }
}
