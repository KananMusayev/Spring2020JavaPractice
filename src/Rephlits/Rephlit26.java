package Rephlits;

import java.util.Scanner;

public class Rephlit26 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int x = inp.nextInt();

        for (int i=0;i<x;i+=3){
            System.out.println(i);
        }
    }
}
