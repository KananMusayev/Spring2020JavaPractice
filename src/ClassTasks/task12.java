package ClassTasks;

import java.util.ArrayList;
import java.util.TreeSet;

public class task12 {

    /*
    Array -- Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class

Ex:  int[] arr = {10,20,7, 8, 90};

                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {


        TreeSet<Integer> set = new TreeSet<>();
        int[] a = {10,20,30,30,10,7, 8, 90};

        ArrayList<Integer>list=new ArrayList<>(set);
        ArrayList<Integer>list2=new ArrayList<>();

        for (int i=list.size()-1;i>=0;i--){
            list2.add(list.get(i));
        }
        System.out.println(list2);
    }
}
