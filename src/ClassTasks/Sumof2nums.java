package ClassTasks;

import java.util.Scanner;

public class Sumof2nums {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

         /*
        ask user enter 2 nums and print out the sum of 2 nums
        use do while loop
         */
         do {
             System.out.println("enter 2 numbers");
             int num1=input.nextInt();
             int num2=input.nextInt();
             int total=num1+num2;
             System.out.println("your total is: "+total);
             System.out.println("do you wanna continue?");
             String answer=input.next();
             if (answer.equalsIgnoreCase("no")){
                 break;
             }
             else if (answer.equalsIgnoreCase("yes")){
                 continue;
             }
         }while (true);


    }
}
