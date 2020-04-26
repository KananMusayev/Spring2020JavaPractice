package Rephlits;

import java.util.Arrays;

public class Rephlit_83 {
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr));
    }



    public static int maxValue(int[] nums){

        Arrays.sort(nums);
        int i=nums[nums.length-1];
        return i;
    }
}
