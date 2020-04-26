package Rephlits;

public class Rephlit_93 {
    public static void main(String[] args)
    {
        int[][] a = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
        };
        System.out.println(max2Delement(a)); //should be 8
    }
    public static int max2Delement(int[][] nums) {
        int max = 0;

        for (int k = 0; k < nums.length; k++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[k][i]>max){
                    max=nums[k][i];
                }
            }
        }
        return max;
    }
}
