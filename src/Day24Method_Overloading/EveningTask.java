package Day24Method_Overloading;

import java.util.Arrays;

public class EveningTask {
    public static void main(String[] args) {
        /*
        write a method that can return the maximum
        number from an int array

         */
        int array[]={1,2,3,4,5,6,7};
        System.out.println(retmax(array));;
    }

    public static int retmax(int array[]){
        Arrays.sort(array);
        int a=array[array.length-1];
        return a;
    }
    public static double retmax(double array[]){
        Arrays.sort(array);
        double a=array[array.length-1];
        return a;
    }


}
