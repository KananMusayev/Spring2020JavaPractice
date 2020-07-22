package SpecialTasks;

import java.util.Arrays;

public class NUnique {
    public static void main(String[] args) {
        int n=6;
        int []a=new int[n];
        int sum=0;
        for (int i=0;i<a.length;i++){
            if (i+1==a.length){
                a[i]=sum-(2*sum);
                break;
            }
            a[i]=i;
            sum+=i;
        }
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
    }
}
