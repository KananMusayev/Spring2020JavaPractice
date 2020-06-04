package ClassTasks;

import Day18Array.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class jfndl {

    public static void main(String[] args) {
        int[] nums= {1, 2, 3, 4, 5, 6, 7};
        int k=nums[2];
        System.out.println(k);
        for (int i = 0; i < nums.length; i++) {
            if (k != nums[0]) {
                int temp = nums[nums.length - 1];
                nums[nums.length - 1] = nums[0];
                for (int j = 0; j < nums.length; j++) {
                    if (j != nums.length - 1)
                        nums[j] = nums[j + 1];
                }
                nums[nums.length - 2] = temp;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
