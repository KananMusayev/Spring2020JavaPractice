package ClassTasks;

import Day18Array.Array;

import java.util.Arrays;

public class Arraysdescendingorder {
    public static void main(String[] args) {
        int[] given={1,2,3,4,5,6,7,8};
       // System.out.println(Arrays.sort(given));
        Arrays.sort(given);

        int [] result=new int[given.length];
        for (int i=0;i<given.length;i++){
            result[i]=given[given.length-1-i];

        }
        System.out.println(Arrays.toString(result));


    }
}
