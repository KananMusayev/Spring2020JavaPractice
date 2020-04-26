package Day17NestedLoop;

import java.util.Scanner;

public class Divide2numswithoutdivision {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter 2 nums");
        int num1=input.nextInt();
        int num2= input.nextInt();


        int count =0;
            while (num1>num2)   {
                num1-=num2;
                count++;
            }
        System.out.println(count);
        System.out.println(num1);//this is the remainder
    }
}
