package ClassTasks;

public class Warmupeveningones {
    public static void main(String[] args) {
        /*
        Write a program that can print out the
        unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3

         */

        int arr[]={1,1,2,3,3,4,5};
        for (int k=0;k<arr.length;k++){
            int count=0;

            for (int i=0;i<arr.length;i++) {
            if (arr[i] == arr[k]) {
                count++;

            }
        }
            if (count == 1) {
                System.out.println(arr[k]);
            }
        }


    }
}
