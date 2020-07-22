package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrayswithnullvalues {

    public static void main(String[] args) {

    //(priority =4)
    /*

     */

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





       /*
           int []a={2,5,15,6,4};
ArrayList<Integer>list=new ArrayList<>(Arrays.asList());
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList());

        for (int i=0;i<a.length;i++){
            list.add(a[i]);
            list2.add(a[i]);
        }

        Collections.sort(list2);
        int b=list2.get(list2.size()-1);
        ArrayList<Integer>list3=new ArrayList<>();
        for (int i=0;i<list.size();i++) {
            if (list2.get(i) == 13) {
                break; }
            list3.add(list.get(i)); }

         Collections.sort(list3);

        int k=(list3.get(list3.size()-1))-list3.get(0);
            System.out.println(k);




        */






    }


}
