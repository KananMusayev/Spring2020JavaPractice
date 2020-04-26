package CodingBat;

import Day25ListWrapperclass.ArraylistVSArray;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.ArrayList;

public class Tasks {
    public static void main(String[] args) {
        int a[] = {1, 4, 1, 4};
        System.out.println(Arrays.toString(a));
    }

    public boolean no14(int[] nums) {

        boolean result=true;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != 1&&nums[i]!=4 ) {
                result = false;
            }
        }
        return result;
        //salam atam atam
    }



}
