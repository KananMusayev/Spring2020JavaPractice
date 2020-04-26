package ClassTasks;

import java.util.Scanner;

public class Warmup22 {
    public static void main(String[] args) {
        /*
        write a program that can ask the user "enter a number"
         five times and return the maximum number
         */
        Scanner input =new Scanner(System.in);
        int min =999999999;
        for (int i=0;i<=4;i++){
            System.out.println("enter a number");
            int num=input.nextInt();
            if (num<min){
                min=num;
            }
        }
        System.out.println(min);
    }
}
