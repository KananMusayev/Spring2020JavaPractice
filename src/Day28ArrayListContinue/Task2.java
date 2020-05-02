package Day28ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        /*
        write a program that can return the second min
        object from the arraylist
         */
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1, 2, 3, 4, 5, 6, 7, 8,8));

        int min= Collections.min(list);

        list.removeAll(Arrays.asList(min));
        int secondmin=Collections.min(list);
        System.out.println(secondmin);

    }
}
