package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup3 {
    public static void main(String[] args) {
        /* Write a program that can move all the zeros to
         last indexes of ArrayList
         Ex:
            list:  {1, 0, 2, 0, 3, 0, 4, 0};
            output: [1, 2, 3, 4, 0, 0, 0, 0]
            DO NOT USE SORT method, DO NOT declare any extra arrayList
         */

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        int count=0;
        for (int i=0;i<list.size();i++){
            if (list.get(i)==0){
                count++;
            }
        }
        list.removeAll(Arrays.asList(0));
        System.out.println(count);
        for (int i=0;i<count;i++){
            list.add(0);
        }
        System.out.println(list);



    }
}
