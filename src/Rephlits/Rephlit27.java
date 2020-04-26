package Rephlits;

import java.util.Scanner;

public class Rephlit27 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int x = inp.nextInt();

        for (int i=x;i>0;i--){
            System.out.print(i-1+" ");
        }
    }
}
