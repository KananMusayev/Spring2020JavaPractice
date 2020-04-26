package Day19ArrayContinue;

import Day18Array.Array;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //2 dimensional array:
        int[] arr1D={1,2,3};//1 dimensional array
        int [][] arr2D={  {1,2,3}  ,{4,5,6}   };
        String[]aa={"A","B"};
        String [][]ab={  {"A","B"}, {"C","D","E"}  };

        System.out.println(ab[1][1]);
        //print me the 1.2.3 from arr2d

        System.out.println(Arrays.toString(arr2D[0]));
        //print me the A.B from ab
        String gfh=Arrays.toString(ab[0]);
        System.out.println(gfh);
        System.out.println(Arrays.toString(ab[1]));

        /*
        Arrays.deeptoString(variableName)
        converts multi dimensional arrays to string value
         */

        //print [ [A,B] [C,D,E] ]

        System.out.println(Arrays.deepToString(ab));


        int[][] Numbers2D={    {1,2}  ,    {3,4},     {5,6,7,8,9,10}};
        //print 6 for me

        System.out.println(Numbers2D[2][1]);
        //print 10 for me
        System.out.println(Numbers2D[2][5]);
        //print me the whole array{5,6,7,8,9,10}

        System.out.println(Arrays.toString(Numbers2D[2]));
        System.out.println(Arrays.deepToString(Numbers2D));

        int [][] Array2D={  {1,2}, {3,4}  };
        int [][][] Array3D={   {  {1,2}, {3,4}  }, {  {5,6}, {7,8}  }};
        // indexes                   0                     1
        //print out 8

        System.out.println(Array3D[1][1][1]);
        //print 5,6

        System.out.println(Arrays.toString(Array3D[1][0]));
        //print 5,6  7,8
        System.out.println(Arrays.deepToString(Array3D[1]));

        //print the whole Array3D

        System.out.println(Arrays.deepToString(Array3D));

        //4dimensional array contains multiple 3 dimensional arrays
        int [][][] numbers3D={   {  {1,2}  }  ,{   {3,4}  }  };

        int [][][][] numbers4D={   {   {  {1,2}  }  ,{   {3,4}  }  } ,     {   {  {1,2}  }  ,{   {3,4}  }  } };

    }
}
