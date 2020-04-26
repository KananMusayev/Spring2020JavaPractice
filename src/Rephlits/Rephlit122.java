package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
        Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
        Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
        Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
         */
        int inhabitants[] = {3, 6, 0, 4, 3, 2, 7, 1};
        for (int k=0;k<inhabitants.length;k++) {
            int sum = 0;
            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] > 0) {
                    inhabitants[i] = inhabitants[i] / 2;
                } else if (inhabitants[i] == 0) {
                    sum += inhabitants[i];
                }
            }
            if (sum == 0) {
                System.out.println("Day " + k + " " + Arrays.toString(inhabitants));
            }
        }





        /*
        System.out.println("Day " + 0 + " " + Arrays.toString(inhabitants));

        for (int k=1;k<inhabitants.length;k++) {
            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] > 0) {
                    inhabitants[i] = inhabitants[i] / 2; }

            }
            System.out.println("Day " + k + " " + Arrays.toString(inhabitants));
            if (inhabitants[0]==0&&inhabitants[1]==0&&inhabitants[2]==0&&inhabitants[3]==0&&inhabitants[4]==0&&inhabitants[5]==0&&inhabitants[6]==0&&inhabitants[7]==0)
            {break;}
        }
        System.out.println("---- EXTINCT ----");
         */

    }

}
