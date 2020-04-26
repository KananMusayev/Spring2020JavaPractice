package CodingBat;

import Day25ListWrapperclass.ArraylistVSArray;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.ArrayList;

public class Tasks {
    public static void main(String[] args) {
        int countzero=0;
        int countone=0;
        int nums[]={1,1,0,1,1,1};


        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i]==0&&nums[i + 1]==1) {
                countone++;
            }

        }
        System.out.println(countone);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int countzero=0;
        int countone=0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i]==0&&nums[i + 1]==1) {
                countone++;
            }

        }
        return countone;
    }


}
