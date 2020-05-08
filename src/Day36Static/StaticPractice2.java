package Day36Static;

import java.util.Scanner;

public class StaticPractice2 {

   static Scanner scan =new Scanner(System.in);

    public static void main(String[] args) {//this is static method


        //Scanner scan =new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=scan.nextInt();//it was giving error bcs variable was instance and static method only accepts static
        System.out.println("Enter num2");
        int num2=scan.nextInt();
        System.out.println("Sum is: "+(num1+num2));

    }


    public void method1(){//this is instance method
        //Scanner scan =new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=scan.nextInt();
        System.out.println("Enter num2");
        int num2=scan.nextInt();
        System.out.println("Multiplication is: "+(num1*num2));


    }
}
