package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit149 {

    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.
    int [] a=new int[r.length+1];
    for (int i=0;i<a.length;i++){
        if (i==r.length){
            a[i]=n;
        break;}

        a[i]=r[i];
    }
        System.out.println(Arrays.toString(a));


    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);
    }
}
