package Rephlits;

import java.util.Arrays;

public class Rephlit_71 {
    public static void main(String[] args) {
        double abc[]={1,2,3};
        System.out.println(Arrays.toString(timesTen(abc)));
    }

    public static double[] timesTen(double[] arr) {


        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]*10;

        }
        return arr;
    }
}
