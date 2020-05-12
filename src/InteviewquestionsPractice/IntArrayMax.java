package InteviewquestionsPractice;

import java.util.Arrays;

public class IntArrayMax {
    public static void main(String[] args) {



        int array[]=new int[5];
        for (int i=0;i<5;i++){
            array[i]=i;
        }
        System.out.println(Arrays.toString(array));
        int max=Integer.MIN_VALUE;

        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);

        //OR
        int array3[]=new int[5];
        for (int i=0;i<5;i++){
            array3[i]=i;
        }
        long max2=-999999999;
        for (int i=0;i<array3.length;i++){
            if (array3[i]>max2){
                max2=array3[i];
            }
        }
        System.out.println(max2);







        //OR
        int array2[]=new int[5];
        for (int i=0;i<5;i++){
            array2[i]=i;
        }
        Arrays.sort(array2);
        System.out.println(array2[array2.length-1]);





    }
}
