package ClassTasks;

import java.util.Arrays;
import java.util.TreeSet;

public class task11 {
    public static void main(String[] args) {



        /*
        Array -- Sort Ascending
Write a return method that can sort an int array
in Ascending order without using the sort method of the Arrays class
     int[] arr = {10, 9, 8, 7};

     arr = Sort(arr);         ==>{ 7, 8, 9, 10};    */

        int[] a= {10, 9, 8, 7};

        TreeSet<Integer>set=new TreeSet<>();
        for (int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set);

    }
}
