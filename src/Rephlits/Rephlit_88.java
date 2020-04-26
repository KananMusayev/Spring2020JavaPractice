package Rephlits;

public class Rephlit_88 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {1,3,5}
        };
        System.out.println(sum2D(a));
    }
    public static int sum2D(int[][] nums){
        int sum=0;
        for (int []each1D:nums){
            for (int each2D:each1D){
                sum+=each2D;
            }
        }
return sum;

    }

}
