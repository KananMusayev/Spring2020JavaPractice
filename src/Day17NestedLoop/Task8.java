package Day17NestedLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        /*
        Array -- Sort Ascending
Write a return method that can sort an int array
in Ascending order without using the sort method
of the Arrays class
  int[] arr = {10, 9, 8, 7};

             arr = Sort(arr);         ==>{ 7, 8, 9, 10};


         */

        int[] arr = {10,6,7,8,5,9};
        int temp=0;
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(10,6,7,8,5,9));
    for (int k=0;k<list.size();k++) {
        for (int i = 0; i < list.size(); i++) {
                if (list.get(k)>list.get(i)){
                    temp=list.get(k);
                    list.set(k,list.get(i));
                    list.set(i,temp);

            }
        }

    }
    for (int i=0;i<arr.length;i++){
        arr[i]=list.get(i);
    }
        System.out.println(Arrays.toString(arr));


    }

}
