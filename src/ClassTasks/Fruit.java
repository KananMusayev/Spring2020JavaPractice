package ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Fruit {

    public static void main(String[] args) {

      ///Write a Java program to find the common elements between two arrays of integers.
        int a[]={6,7,5,3,4,2};
        int k[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            k[i]=a[i];
        }

        Arrays.sort(k);
        int max=k[k.length-1];

        System.out.println();
        int maximumsindex=0;
        for (int i=a.length-1;i>=0;i--){
            if (a[i]==max){
                maximumsindex=i;
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        list.add(maximumsindex);
        list.add(a.length);
        for (int i=0;i<a.length;i++){

        }









    }












}


