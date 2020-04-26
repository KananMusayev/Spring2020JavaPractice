package Examples;

import java.util.Scanner;

public class Arrayexample {
    public static void main(String[] args) {
        /*
        Write a program that can return the maximum value
        from an int array and then find the second max num
         */
        Scanner input =new Scanner(System.in);
        int[] arr =new int[5];
        int max = 0;
        for (int i = 0;i<arr.length;i++) {
            System.out.println("Please enter 5 nums");
            arr[i] = input.nextInt();
            if (arr[i]>max){
                max=arr[i];
            } }
        System.out.println(max);
    }
}
