package Day21Methods;

import java.util.Arrays;

public class Task4 {
    /*
    creata a function that can print
    the maximum number from any given array
     */
    public static void main(String[] args) {
        int abc[]={2,4,6,7,8,9};
maxnum(abc);
maxnum1(abc);
    }
    public static void maxnum(int[]arr){

        int max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }


    public static void maxnum1(int[]arr1){
        Arrays.sort(arr1);
        System.out.println(arr1[arr1.length-1]);
    }
}
