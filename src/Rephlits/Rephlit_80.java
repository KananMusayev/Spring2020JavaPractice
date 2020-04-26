package Rephlits;

import Day18Array.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit_80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }


        int a=0;
        int v[]=new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){
            v[a]=arr[i];
            a++;
        }

        for (int each:v){
            System.out.println(each);
        }
    }
}
