package Examples;

import java.util.Scanner;

public class Arrayexample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Enter 5 nums and find the sum do it with array
        int num[]=new int[5];
        for (int i =0;i<num.length;i++){
        System.out.println("Enter 5 nums");
        num[i]=input.nextInt();
    }
        int sum=0;
        for (int i=0;i<num.length;i++){
            if (true){
                sum+=num[i];
            }

        }
        System.out.println(sum);
}}
