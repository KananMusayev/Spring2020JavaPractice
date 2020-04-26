package Day18Array;

import java.util.Arrays;

public class ArrayTasks {
    public static void main(String[] args) {
        /*
        write a program that can combine two arrays of any lengths,
        and retunr the third array
        arr1 ==> [1,2,3]
        arr2 ==> [4,5,6,7];
        arr3 ==> [1,2,3,4,5,6,7]

         */
        int[] arr1={1,2,3};
        int[] arr2={4,5,6,7};

        int []arr3=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr3));
        for (int k=0;k<arr2.length;k++){
            arr3[k+3]=arr2[k];
        }

        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
