package Day16DoWhileLoops;

import java.util.Scanner;

public class WhileLoop7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter num1");
            int num1 = input.nextInt();
            System.out.println("Enter num2");
            int num2 = input.nextInt();
            System.out.println("addition is:" + (num1 + num2));
            System.out.println("Do you wanna continue?");
            String answer = input.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }

        }
    }
}