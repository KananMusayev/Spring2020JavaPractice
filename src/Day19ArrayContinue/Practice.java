package Day19ArrayContinue;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[][] array2D={  {1,2}  , {3,4,5,6,7}  ,{8,9} };
        //length method:
               int length= array2D.length;//3
        for (int i=0;i<array2D.length;i++){
            System.out.println(Arrays.toString(array2D[i])); }

        //System.out.println(Arrays.toString(array2D[0][0]));

        for (int i=0;i<array2D.length;i++){//checks each index or 1d array
            for (int j=0;j<array2D[i].length;j++)//checks the each index of elements within the 1darray
            System.out.print(array2D[i][j]+" ");
        }








    }
}
