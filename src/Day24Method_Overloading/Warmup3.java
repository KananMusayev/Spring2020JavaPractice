package Day24Method_Overloading;

import java.util.Arrays;

public class Warmup3 {
    public static void main(String[] args) {
/*
 write a method that can return the minimum number from an int array
 */
        int[] arr = {2, 4, 5, 6};
        System.out.println(minnum(arr));
    }

    public static int minnum(int[] array) {
        Arrays.sort(array);
        int a = array[0];
        return a;
    }

    public static double minnum(double[] array) {
        Arrays.sort(array);
        double a = array[0];
        return a;

    }
}