package InteviewquestionsPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysSortingwithoutSortMethod {

    public static void main(String[] args) {
        /*
        ArrayList -- sorting in ascending
Write a method that can sort the ArrayList
in Ascending order without using the sort method
         */


        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,5,3,7,6,8,2,4,9,0));

        //1,5,3,7,6,8,2,4,9,0

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }




    }
}
