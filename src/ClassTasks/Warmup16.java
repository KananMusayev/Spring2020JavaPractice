package ClassTasks;

import java.util.Scanner;

public class Warmup16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        /*
        return all the even numbers between given 2 numbers
         */

        System.out.println("Please enter the first num");
        int start = input.nextInt();
        System.out.println("Plese enter the second num");
        int end =input.nextInt();

        for (int i =start;i<=end;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }






    }
}
