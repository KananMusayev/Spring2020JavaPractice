package Day16DoWhileLoops;

import java.util.Scanner;

public class Dowhileloop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*

ask user enter 2 nums
print out the addition of those 2 nums
 */
do {
        System.out.println("Enter num1");
        int num1=input.nextInt();
        System.out.println("Enter num2");
        int num2 = input.nextInt();
        System.out.println("addition is:"+(num1+num2));
        System.out.println("Do you wanna continue?");
        String answer = input.next();
        if (answer.equalsIgnoreCase("no")){
            break;
        }}
while (true);


    }
}
