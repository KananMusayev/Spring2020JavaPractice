package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        /*
        write a program that can return the second max
        object from the arraylist
         */
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,8));

        int max= Collections.max(list);
        int secondmax=0;
        if (list.contains(max)){
            list.removeAll(Arrays.asList(max));
        }
         secondmax= Collections.max(list);

        System.out.println(secondmax);
    }
}
