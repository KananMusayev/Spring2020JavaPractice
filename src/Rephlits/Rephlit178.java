package Rephlits;

import java.util.Arrays;

public class Rephlit178 {
    public static void main(String[] args) {


        int a[]={1,2,3};
        int b[]={4,5,6};
        mergR(a,b);
        System.out.println(Arrays.toString(mergR(a,b)));
    }

    public static int[] mergR(int[] a,int[] b) {
        int c[]=new int[a.length+b.length];
        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        int k=0;
        for (int i=a.length;i<c.length;i++){
            c[i]=b[k];
            k++;
        }
        return c;




    }

    }
