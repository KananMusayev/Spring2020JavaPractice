package Day13_Scanner_String_Method;

import  java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = "Hello Kenan";
        String str2 = "Hello Kenan";
        boolean R1 = str1==str2;
        System.out.println(R1);
        String str3 = new String("Hello Kenan");
        String str4 = new String("Hello Kenan");
        boolean R2= str3==str4;//false
        System.out.println(R2);
        boolean R3 = str1 == str3; // false
        System.out.println(R3);




    }
}
