package Day11Scanner;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        byte byteNum1 = input.nextByte();
        System.out.println("You have entered : "+byteNum1);
        System.out.println("Enter Second Number");
        byte byteNum2 = input.nextByte();
        System.out.println("You have entered : "+byteNum2);
        System.out.println("Enter Third Number");
        byte byteNum3= input.nextByte();
        System.out.println("You have entered : "+byteNum3);

    }
}
