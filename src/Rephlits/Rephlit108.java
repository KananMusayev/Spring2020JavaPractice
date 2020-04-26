package Rephlits;

import java.util.Scanner;

public class Rephlit108 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int k = 0; k < n; k++) {
            for (int z = 0; z <= k; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
