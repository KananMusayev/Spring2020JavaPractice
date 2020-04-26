package ClassTasks;

import java.util.Arrays;

public class combiningarraysmultidimensional {
    public static void main(String[] args) {
        int[][] array2D={  {1,2}  , {3,4,5,6,7}  ,{8,9} };
        // print out 1 2 3 4 5 6 7 8 9 ;

        int []x=new int[array2D[0].length+array2D[1].length+array2D[2].length];
        for (int i=0;i<x.length;i++){
            x[i]=array2D[i][i];
        }
        System.out.println(Arrays.toString(x));
    }
}
