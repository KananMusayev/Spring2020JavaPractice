package Rephlits;

import java.util.Scanner;

public class Rephlit155 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }
    public static void fib(int num){
        int a=0;
        int b=1;
        int c=a+b;
        a=b;
        b=c;
        System.out.println(c);

    }

    }
