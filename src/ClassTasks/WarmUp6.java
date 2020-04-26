package ClassTasks;

import java.util.Scanner;

public class WarmUp6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        /*
        write a program that can calculate the sum
        of all numbers between 1 to any given number
        ex:
            input: 100

         */
        int a = input.nextInt();
        int sum =0;
        for (int i=1;i<=a;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}
