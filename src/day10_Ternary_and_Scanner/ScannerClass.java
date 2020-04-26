package day10_Ternary_and_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte Value 1 ");
       byte byteNum= input.nextByte();
        System.out.println("You have entered : "+byteNum);
        System.out.println("Enter another byte Value 2 ");
              byte byteNum2=input.nextByte();
        System.out.println("You have entered : "+byteNum2);
        System.out.println("Addition is: "+(byteNum+byteNum2));

    }
}
