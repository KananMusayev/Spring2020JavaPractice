package ClassTasks;

import java.util.Scanner;

public class Returningminimumnumfromforloop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /*
        write a program that can ask the user "enter a number"
         five times and return the minimum number
         */

        int min=999999999;
        for (int i=0;i<5;i++){
            System.out.println("enter a number");
            int num=input.nextInt();
            if (num<min){
                min=num;
            }
        }
        System.out.println(min);
    }
}
