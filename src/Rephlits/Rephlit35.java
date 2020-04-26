package Rephlits;

import java.util.Scanner;

public class Rephlit35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();


        int sum=0;
        System.out.println();
        for (int i=0;i<=num2-num1;i++){
            if ((num1+i)%2!=0){
                sum+=num1+i;
                 } }
        System.out.println(sum);

    }
}
