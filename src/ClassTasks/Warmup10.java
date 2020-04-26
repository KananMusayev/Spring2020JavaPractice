package ClassTasks;

import java.util.Scanner;

public class Warmup10 {
    public static void main(String[] args) {
        /*
        write a program that can ask the user
        "enter a number" five times and return the maximum number
		hint: you will nedd for loop and if statement
         */

        Scanner input = new Scanner(System.in);
        int max = 0;
        for (int i =0;i<5;i++){
            System.out.println("Enter a number");
            int a = input.nextInt();
            if (a>max){
                max=a;
            }
        }
        System.out.println(max);

    }
}
