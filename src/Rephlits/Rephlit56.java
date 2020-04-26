package Rephlits;

import java.util.Scanner;

public class Rephlit56 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double price=0;
            System.out.println("Select screen size:");
            String size = scan.next();
            if (size.equalsIgnoreCase("13.3")){
                price+=200; }
            else if (size.equalsIgnoreCase("15.0")){
                price+=300; }
            else if (size.equalsIgnoreCase("17.3")){
                price+=400; }
            System.out.println("Select CPU type:");
            String CPU = scan.next();
            if (CPU.equalsIgnoreCase("i3")){
                price+=150; }
            else if (CPU.equalsIgnoreCase("i5")){
                price+=250; }
            else if (CPU.equalsIgnoreCase("i7")){
                price+=350; }

            System.out.println("Select RAM size:");
            int ram1 = scan.nextInt();
            if (ram1==4){
                price+=50; }
            else if (ram1 == 8){
                price+=100; }
            else if (ram1==12){
                price+=150; }
            else if (ram1==16){
                price+=200; }
            System.out.println("Select storage type:");
            String storageType1 = scan.next();
            System.out.println("Enter memory size:");
            int MemorySize=scan.nextInt();
            if (storageType1.equalsIgnoreCase("SSD")){
                if (MemorySize==500){
                    price+=100; }
                else if (MemorySize==1000){
                    price+=200; }
                else if (MemorySize==1500){
                    price+=300; } }

            if (storageType1.equalsIgnoreCase("HDD")){
                if (MemorySize==500){
                    price+=50; }
                else if (MemorySize==1000){
                    price+=100; }
                else if (MemorySize==1500){
                    price+=150; } }


            System.out.println("Enter screen resolution:");
            String ScreenResolution1 = scan.next();
            if (ScreenResolution1.equalsIgnoreCase("FULLHD")){
                price+=100; }
            else if (ScreenResolution1.equalsIgnoreCase("4K")){
                price+=200; }
            System.out.println("Laptop price is: $"+price);

    }
}
