package ClassTasks;

import java.util.*;

public class abdf {

    public static void main(String[] args) {


         /*
Write a return method that can reverse negative number and return it as int
         */
         //-567
        int i=-567;
        String a=""+i;
        System.out.println(a);
               String res="-";
        for (int k=a.length()-1;k>0;k--){
            res+=a.substring(k,k+1);
        }
        System.out.println(res);

    }







}