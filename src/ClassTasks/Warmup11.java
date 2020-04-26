package ClassTasks;

import java.util.Scanner;

public class Warmup11 {
    public static void main(String[] args) {
        /*
        write a program that can ask the user
        "enter a number" five times and return the minimum number
		hint: you will nedd for loop and if statement
         */

        Scanner input = new Scanner(System.in);
        int min = 999999999;
        for (int i =0;i<5;i++){
            System.out.println("Enter a number");
            int a = input.nextInt();
            if (a<min){
                min=a;
            }
        }
        System.out.println(min);
    }
}
