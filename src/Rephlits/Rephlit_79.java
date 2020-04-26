package Rephlits;

import java.util.Arrays;
import java.util.Scanner;

public class Rephlit_79 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }

        //int arr[]={4,62,8,5,4}
        //{4,62,8,5,4}

        String a=Arrays.toString(arr);
        a=a.replace("[","{");
        a=a.replace("]","}");
        a=a.replaceAll(" ","");
        System.out.println(a);


    }
}
