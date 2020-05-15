package Rephlits;

import java.util.Arrays;

public class aaa {



    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={4,5,6};
        int f[]=new int[a.length*2];
        for(int i=0;i<f.length;i++){
            if(a.length>i){
                f[i]=a[i];
            } if(b.length>i){
                f[i+a.length]=b[i];
            }
        }
        System.out.println(Arrays.toString(f));

    }

}
