package Leetcode;

import java.util.Arrays;

public class TwoSum {

/*
Given an array of integers, return indices of the two numbers
such that they add up to a specific target.
You may assume that each input would have exactly
one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
    public static int[] twoSum(int[] nums, int target) {

        int a[]=new int[2];

        for (int i=0;i<nums.length;i++){
            for (int k=0;k<nums.length;k++){
                    if (nums[i]+nums[k]==target){
                        a[0]=nums[i];
                        a[1]=nums[k];
                    }
            }
        }
        return a;

    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }
}
