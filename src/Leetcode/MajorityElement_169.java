package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElement_169 {


    public static void main(String[] args) {


    /*
    Given an array of size n, find the majority element.
    The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element
always exist in the array.

Example 1:
Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
     */
        int []a={1,2,3,4,5,7,8,9,6,4,4,4,4,4,4,4,4,4};
        System.out.println(majorityElement(a));

    }
    public  static int majorityElement(int[] nums) {


        int result = 0, count = 0;

        for(int i = 0; i<nums.length; i++ ) {
            if(count == 0){
                result = nums[ i ];
                count = 1;
            }else if(result == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        return result;
    }
}
