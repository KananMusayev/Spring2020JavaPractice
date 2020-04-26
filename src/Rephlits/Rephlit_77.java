package Rephlits;

import java.util.Scanner;

public class Rephlit_77 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }


        for (int each:arr){
            System.out.println(each);
        }
    }


}
