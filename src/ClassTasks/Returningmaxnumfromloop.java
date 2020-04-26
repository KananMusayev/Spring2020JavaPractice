package ClassTasks;

import java.util.Scanner;

public class Returningmaxnumfromloop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /*
        write a program that can ask the user "enter a number"
         five times and return the maximum number
         */
        int max=0;
        for (int i=0;i<5;i++){
            System.out.println("Enter a number");
            int num=input.nextInt();
            if (num>max){
                max=num;
            }

        }
        System.out.println(max);

    }
}
