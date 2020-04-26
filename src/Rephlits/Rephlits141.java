package Rephlits;

import java.util.Scanner;

public class Rephlits141 {
    public static void main(String[] args) {
           /*
    create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
     */
           cube();
    }
        public static void cube(){
            Scanner input =new Scanner(System.in);
            int a=input.nextInt();
            System.out.println(a*a*a);
    }

}
