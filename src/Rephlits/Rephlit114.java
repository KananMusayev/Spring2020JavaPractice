package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit114 {
    public static void main(String[] args) {
        /*
        Given an array nums with 7 integers every
        element is repeated twice - except one.
         Find that element and print it to console.
        Example:
        nums -> [1, 1, 2, 3, 4, 3, 4]
                     2
         */
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        for (int k=0;k<nums.length;k++){
            int count=0;
        for (int i =0;i<nums.length;i++) {
            if (nums[i] == nums[k]) {
                count++;
            }}
            if (count == 1) {
                System.out.println(nums[k]);
            }}



    }
}
