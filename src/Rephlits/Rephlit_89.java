package Rephlits;
import java.util.Arrays;
public class Rephlit_89 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);

        }


    public static void reduce10(int[][] nums){
        for (int[]each1D:nums){
            for (int each2D:each1D){
                System.out.print((each2D-10)+" ");
            }
        }



    }

}
