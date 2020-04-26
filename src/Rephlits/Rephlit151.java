package Rephlits;

import java.util.Scanner;

public class Rephlit151 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        for (int k = 0; k < nums.length; k++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == nums[k]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[k]);
            }
        }
    }
    }
