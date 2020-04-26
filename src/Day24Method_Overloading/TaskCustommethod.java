package Day24Method_Overloading;

import Day18Array.Array;

import java.util.Arrays;

public class TaskCustommethod {
    public static void main(String[] args) {

        int [] array={1,2,3,4,5,6,7};
         array=sort(array);
        System.out.println(Arrays.toString(array));
    }


    //create a custom method that can sort arrays in descending order


    public static int[] sort(int arr[]){
        Arrays.sort(arr);
        int numbers[]=new int[arr.length];
        int z=0;
        for (int i=arr.length-1;i>=0;i--){
            numbers[z]=arr[i];
            z++;
        }

        return numbers; }



}
