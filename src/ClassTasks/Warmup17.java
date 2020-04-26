package ClassTasks;

import java.util.Scanner;

public class Warmup17 {
    public static void main(String[] args) {
        /*
        return all the even numbers between given 2 numbers
         */
        //use while loop


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first num");
        int start = input.nextInt();
        System.out.println("Plese enter the second num");
        int end =input.nextInt();

        while (start<end){
            start++;
            if (start%2==0){
                System.out.println(start); }
        }

    }
}
