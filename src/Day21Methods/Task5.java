package Day21Methods;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int []abc={1,2,3,4,5,6,7,8,9};
        descending(abc);
    }

    public static void descending(int[]arr){

        /*
        create a function that can print out the
        array in descending order
		[1,2,3] == > [3,2,1]
         */
        Arrays.sort(arr);
        int[] a2=new int[arr.length];
        int z=0;
        for (int i=arr.length-1;i>=0;i--){
            a2[z]=arr[i];
            z++;
        }
        System.out.println(Arrays.toString(a2));

    }
}
