package ClassTasks;

import java.util.Arrays;

public class Warmupp {
    public static void main(String[] args) {
        int[][] numbers = { {1,2,3}, {4,5,6,7,8,9}, {10,11,12,13,14}, {15,16,17,18,19,20,21} };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number

        for (int []each : numbers){
            for (int each2:each){
                if (each2%2==0){
                    System.out.println(each2);
                }
            }
        }

    }
}
