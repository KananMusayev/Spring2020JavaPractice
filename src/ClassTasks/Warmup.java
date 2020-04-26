package ClassTasks;

import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {
        /*
        write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods
         */

        String str1="aabbbc";
        String str2="cabe";
        String empty="";

        String[] arr1=str1.split("");

        for (int i=0;i<arr1.length;i++){
            if (!(empty.contains(arr1[i]))){
                empty+=arr1[i];
            }
        }
        String abc1[]=empty.split("");
        String abc2[]=str2.split("");
        Arrays.sort(abc1);
        Arrays.sort(abc2);
       String result1=Arrays.toString(abc1);
        String result2=Arrays.toString(abc2);


        if (result1.equals(result2)){
            System.out.println(true);
        }
        else if (!(result1.equals(result2))){
            System.out.println(false);
        }


    }
}
