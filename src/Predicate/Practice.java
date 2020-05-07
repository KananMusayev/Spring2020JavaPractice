package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {

        /*
         write a program that can return the unique objects from a anArray List
          of Integers
            Ex:
                list: {1,1,2,3,4,5,5}
                sout(list); ==> {2,3,4};
        Note: 1. DO NOT use any extra arrayList
              2. DO NOT use any loops
              3. do not use any sort method
              4. use predicate only and collections methods only
         */

        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));


        a.removeIf(p-> Collections.frequency(a,p)>1);

    }

}
