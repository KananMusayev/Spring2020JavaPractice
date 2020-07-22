package ClassTasks;

import java.util.Scanner;

public class fksgegr {


    public static void main(String[] args) {
        /*
          /*
        write a program that can ask the user
        "enter a number" five times and return the maximum number
		hint: you will nedd for loop and if statement
         */
        Scanner input=new Scanner(System.in);
        int max=0;
        for (int i=0;i<5;i++){
            int k=input.nextInt();
            if (k>max){
                max=k;
            }
        }
        System.out.println(max);




    }
}
