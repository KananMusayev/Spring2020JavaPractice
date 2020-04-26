package Rephlits;

import java.util.Scanner;

public class Rephlit57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullname = scan.nextLine();
        boolean a = fullname.equalsIgnoreCase("Max Payne");
        boolean b = fullname.equalsIgnoreCase("Alan Wake");
        if (a&&b){
            System.out.println("User found!"); }
        else {
            System.out.println("User not found!"); }



    }
}
