package Day17NestedLoop;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


      while (true) {
          System.out.println("Enter 2 numbers");
          int a = input.nextInt();
          int b = input.nextInt();
          System.out.println("Multiplication is:" + (a * b));
          System.out.println("Do you wanna continue?");
          String answer = input.next();
          while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
              System.out.println("Please make up your mind");
              System.out.println("Do you wanna continue?");
              answer=input.next();
          }
          if (answer.equalsIgnoreCase("no")){
              break;
          }
      }



    }
}
