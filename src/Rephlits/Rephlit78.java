package Rephlits;

import java.util.Scanner;

public class Rephlit78 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]*10;
        }

        for (int each:arr){
            System.out.println(each);
        }
    }
}
