package InteviewquestionsPractice;

import java.util.Arrays;

public class IntArrayMIN {
    public static void main(String[] args) {


        int array[]=new int[5];
        for (int i=0;i<5;i++){
            array[i]=i;
        }

        int min=Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);

        //OR
        int array2[]=new int[5];
        for (int i=0;i<5;i++){
            array2[i]=i;
        }
        int min2 =999999999;
        for (int i=0;i<array2.length;i++){
            if (array2[i]<min2){
                min2=array2[i];
            }
        }
        System.out.println(min2);


        //OR

        int array3[]=new int[5];
        for (int i=0;i<5;i++){
            array3[i]=i;
        }

        Arrays.sort(array3);
        System.out.println(array3[0]);

    }
}
