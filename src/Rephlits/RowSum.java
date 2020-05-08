package Rephlits;

public class RowSum {

    public static int[] rowSums(int[][] nums)
    {

        //int[][] a = {  {1,1,2},  {3,1,2},  {3,5,3},  {0,1,2}  };
        int[] rowsum=new int[nums.length];
        for (int k=0;k<nums.length;k++) {
            for (int i = 0; i < nums[k].length; i++) {
                rowsum[k] += nums[k][i];

            }
        }
        return rowsum;

    }


    public static void main(String[] args) {

    }
}
