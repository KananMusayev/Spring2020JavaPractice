package ClassTasks;

import java.util.Scanner;

public class Warmup19 {
    public static void main(String[] args) {
        /*
        ask user enter 2 nums and print out the sum of 2 nums
        use do while loop
         */
        Scanner input = new Scanner(System.in);
       do {
           System.out.println("Please enter the first num");
           int num1 = input.nextInt();
           System.out.println("Plese enter the second num");
           int num2 = input.nextInt();
           int sum = num1 + num2;
           System.out.println("your total is :" + sum);
           System.out.println("Do you want to continue?");
           String answer = input.next();
           if (answer.equalsIgnoreCase("no")){
               break;
           }
       }while (true);




    }
}
