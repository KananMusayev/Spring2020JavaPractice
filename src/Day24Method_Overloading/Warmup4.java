package Day24Method_Overloading;

import java.util.Arrays;

public class Warmup4 {
    public static void main(String[] args) {
/*
write an int[] return method that can sort an int array in desending order
 */
int a1[]={1,3,5,6,7,8,9};
char a2[]={'a','b','c','z','d','k'};
double a3[]={2.5,4.1,5.8,7.6,9.7};
        System.out.println(Arrays.toString(descending(a2)));
    }
    public static int [] descending(int[]array){
        Arrays.sort(array);
        int arr[]=new int[array.length];
        int a=arr.length-1;
        for (int i=0;i<arr.length;i++){
            arr[i]=array[a];
            a--;
        }
        return arr;
    }

    public static double [] descending(double[]array){
        Arrays.sort(array);
        double arr[]=new double[array.length];
        int a=arr.length-1;
        for (int i=0;i<arr.length;i++){
            arr[i]=array[a];
            a--;
        }
        return arr;
    }

    public static char [] descending(char[]array){
        Arrays.sort(array);
        char arr[]=new char[array.length];
        int a=arr.length-1;
        for (int i=0;i<arr.length;i++){
            arr[i]=array[a];
            a--;
        }
        return arr;
    }


}
