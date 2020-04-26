package Rephlits;

public class AssestmentTest4point1 {
    public static void main(String[] args) {

    }
    public static boolean isSort(int[] nums){
        boolean result=false;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]<nums[i+1]){
                result=true;
            }
            else if (nums[i]>nums[i+1]){
                result=false;
            }
        }
        return result;
    }

}
