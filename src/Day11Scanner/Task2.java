package Day11Scanner;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Write a java program that asks user to enter three numbers and retursns
        the lasgest number
        Do it with ternary
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        double n1 = input.nextDouble();
        System.out.println("Enter Second Number");
        double n2 = input.nextDouble();
        System.out.println("Enter Third Number");
        double n3 = input.nextDouble();
       double maxnumber= n1>n2&&n1>n3?n1
                :n2>n1&&n2>n3?n2
                    :n3;
        System.out.println("Maximum number is :"+maxnumber);

        System.out.println(maxnumber);


    }
}
