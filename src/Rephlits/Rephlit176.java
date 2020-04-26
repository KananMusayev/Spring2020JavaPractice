package Rephlits;

import java.util.Arrays;

public class Rephlit176 {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6};
        double b[]={1.2,3.4,5.6,7.5};
        System.out.println(maxnum(b));
        System.out.println(maxnum(a));

    }

    public static int maxnum(int[]a){
        Arrays.sort(a);
        int max=a[a.length-1];
        return max;
    }
    public  static  double maxnum(double[]a){
        Arrays.sort(a);
        double max=a[a.length-1];
        return max;
    }
}
