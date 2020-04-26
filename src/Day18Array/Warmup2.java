package Day18Array;

import java.util.Scanner;

public class Warmup2 {
    public static void main(String[] args) {
        /*
        Write a program that can divide
        2 given nums without using division operator
         */
        Scanner input = new Scanner(System.in);

        int count =0;
        System.out.println("Enter 2 nums");
        int num1=input.nextInt();
        int num2=input.nextInt();
        for (int i=0;i<num1;i++){
        if (num1>num2){
            num1-=num2;
            count++;

        }}
        int result ;
        System.out.println("division is "+count+" and remainder is "+num1);
    }
}
