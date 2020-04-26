package Day19ArrayContinue;

import java.util.Arrays;

public class Arraytask {
    public static void main(String[] args) {
        /*
        write a program that can print arrays in Descending
        order(Lasrgest to smaller)
         */
        int []a={0,1,5,7,2,6,8,4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        String c="";
        for (int i=a.length-1;i>=0;i--){
            c+=a[i]+", "; }
        System.out.println(c);

        String d="[";
        c=d+c;
        System.out.println(c);
        c=c.trim();
        System.out.println(c);
        c=c.substring(0,c.length()-1);
        System.out.println(c);
        String x="]";
        c+=x;
        System.out.println(c);

        int []a1={10,11,15,17,12,16,18,14};
        Arrays.sort(a1);
        int[] a2=new int[a1.length];
        int z=0;
        for (int i =a1.length-1;i>=0;i--){
            a2[z]=a1[i];
            z++;
        }
        System.out.println(Arrays.toString(a2));
    }
}
