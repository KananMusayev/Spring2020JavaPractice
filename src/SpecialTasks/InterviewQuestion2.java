package SpecialTasks;

import java.util.Arrays;

public class InterviewQuestion2 {


    public static void main(String[] args) {
        int []a={2,5,15,6,4};
        int []b=new int[a.length];
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        Arrays.sort(a);
        int k=a[a.length-1];
        int g=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==k){
                g=i;
            }
        }
        System.out.println(g);
        int[]j=new int[g];
        for (int i=0;i<g;i++){
            j[i]=b[i];
        }
        System.out.println(Arrays.toString(j));
        Arrays.sort(j);
        System.out.println(k-j[0]);
    }
}
