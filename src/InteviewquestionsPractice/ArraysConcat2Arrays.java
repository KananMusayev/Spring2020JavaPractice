package InteviewquestionsPractice;

import java.util.Arrays;

public class ArraysConcat2Arrays {
    public static void main(String[] args) {
        /*
        Array -- Concat two arrays
Write a return method that can concate two arrays
         */

        int a[]={1,2,3,4};
        int b[]={5,6,7,8};

        int array[] =new int[a.length+b.length];
        int Alength=a.length;
        int Blength=b.length;
        int k=0;
        int f=0;
        for (int i=0;i<Alength+Blength;i++){
            if (i<Alength){
                array[k]=a[i];}
            else if (i>=Alength){

                array[k]=b[f];
            f++;
            }

            k++;
        }

        System.out.println(Arrays.toString(array));
    }

    public static int[] concatarrays(int[]a,int[]b){

        int array[] =new int[a.length+b.length];
        int Alength=a.length;
        int Blength=b.length;
        for (int i=0;i<Alength+Blength;i++){
            int k=0;
            if (i<Alength){

            array[k]=a[i];}
            else if (i>=Alength){
                array[k]=b[i];
            }
            k++;
            if (i+1==Alength){
                Alength=Blength;
                i=0;
            }
        }
            return array;

    }


}
