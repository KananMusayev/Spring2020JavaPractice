package ClassTasks;

import java.util.Arrays;

public class MultidimensionalArraytasksandmethods {
    public static void main(String[] args) {
        int [][]arr2D={     {1,2,}   ,   {3,4,5,6,7}    ,{8,9}  };

        //print out 1 2 3 4 5 6 7 8 9
        int r=0;
        for (int i =0;i<arr2D.length;i++) {
            for (int k = 0; k < arr2D[i].length; k++) {

                System.out.print(arr2D[i][k]+" ");

            }
        }








    }
}
