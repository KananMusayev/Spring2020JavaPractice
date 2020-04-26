package Rephlits;

import java.util.Arrays;

public class Rephlit_82 {
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(minValue(arr));
    }

    public static int minValue(int[] nums){

            Arrays.sort(nums);
            int i=nums[0];
            return i;
    }
}
