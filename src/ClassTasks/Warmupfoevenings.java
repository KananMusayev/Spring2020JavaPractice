package ClassTasks;

import java.util.Arrays;

public class Warmupfoevenings {
    public static void main(String[] args) {
        /*
        Write a program that can print out the
         unique values from  String Array
         */

        String[] arr = {"A", "B", "A", "C", "B", "E", "E"};
        for (int k = 0; k < arr.length; k++) {
            int count = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == arr[k]) {
                    count++;
                }
            }
            if (count == 1){
                System.out.print(arr[k]); }

        }
    }
}
