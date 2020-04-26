package Rephlits;

import java.util.Scanner;

public class Rephlit32 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int x = inp.nextInt();
        int k=0;
        int z=1;
        int s;
        for (int i=0;i<x;i++){
            System.out.print(k+" ");
            s=z;
            z+=k;
            k=s;
        }
    }
}
