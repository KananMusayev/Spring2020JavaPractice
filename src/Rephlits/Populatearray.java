package Rephlits;

import java.util.Arrays;

public class Populatearray {

    /*
    populate(new int[5])
returns:[1,2,3,4,5]
     */

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8,9};
    missingNumber(arr);
    }

    public static int[] populate(int[] r) {
        for (int i = 0; i < r.length; i++) {
            r[i] = i+1;
        }
        return r;
    }

    public static int missingNumber(int[] arr){
        Arrays.sort(arr);

int a=0;
//[1, 2, 3, 4, 5, 6, 7, 8, 10]
        int result=10;
            for (int i=1;i<=9;i++){

                if (arr[a]!=i){
                    result=i;
                    break;
                }
                a++;
            }
        return result;
    }

}
