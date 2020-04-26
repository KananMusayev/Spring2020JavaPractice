package Day17NestedLoop;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        /*
        ask user to enter 2 num and print
        addition then ask if they want to continue nd if answer is yes

         */
        while (true) {
            System.out.println("Enter two numbers");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("Addition is: " + (a + b));
            System.out.println("Do you wanna continue?");
            String answer = input.next();
            while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid Entry please re enter");
                System.out.println("Do you wanna continue?");
                answer=input.next();
            }
            if (answer.equalsIgnoreCase("no")){
                break;
            }
        }






    }
}
