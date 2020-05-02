package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Warmup3secondway {
    public static void main(String[] args) {

        /* Write a program that can move all the zeros to
         last indexes of ArrayList
         Ex:
            list:  {1, 0, 2, 0, 3, 0, 4, 0};
            output: [1, 2, 3, 4, 0, 0, 0, 0]
            DO NOT USE SORT method, DO NOT declare any extra arrayList
         */


        /*
        Collections.frequency method:

        Collections.frequency(Collection Type,Object) returns the frequency
        of the given object from the given collectionType
         */

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        int count=Collections.frequency(list,0);
        System.out.println(count);
        list.removeAll(Arrays.asList(0));
        for (int i=0;i<count;i++){
            list.add(0);
        }
    }
}
