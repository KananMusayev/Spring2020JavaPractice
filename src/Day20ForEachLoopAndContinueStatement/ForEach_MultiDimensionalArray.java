package Day20ForEachLoopAndContinueStatement;

import java.util.Arrays;

public class ForEach_MultiDimensionalArray {
    public static void main(String[] args) {
        int []arr1={1,2,3,4};
        for (int each :arr1){
            System.out.println(each); }
        int [][]arr2={   {1,2,3,4},    {5,6,7,8}};

        for (int i=0;i<arr2.length;i++){
            for (int k=0;k<arr2[i].length;k++){
                System.out.print(arr2[i][k]);
            }
        }
        System.out.println();


        for (int[] each1:arr2){
            for (int each2 :each1){
                System.out.print(each2); } }
        System.out.println();

        String[][]str2D={   {"Esmira","Mishi"}    ,      {"Alisa","Kenan"}    };


        for (String []each:str2D){
            System.out.println(Arrays.toString(each));
        }

        for (String[] each1:str2D){
            for (String each2:each1){
                System.out.println(each2);
            }
        }

        System.out.println();
        //3 dimensional


        int [][][] arr3D ={     { {1,2} ,   {3,4} }  ,    { {5,6} ,{7,8,9} }       };
        for (int[][]each1:arr3D){
            for (int[]each2:each1){
                for (int each3:each2){
                    System.out.print(each3+" ");
                }
            }
        }







    }
}
