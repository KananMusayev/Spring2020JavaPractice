package Rephlits;

import java.util.Scanner;

public class Rephlit45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();
        int price = 0;
        int cardbalance = 100;
        if (item.equals("Smartphone")){
            price+=300;
            cardbalance=cardbalance-price;
            System.out.println("Sorry, not enough funds on your gift card!"); }
        else if (item.equals("Laptop")){
            price+=400;
            cardbalance=cardbalance-price;
            System.out.println("Sorry, not enough funds on your gift card!"); }
        else if (item.equals("Charger")){
            price+=15;
            cardbalance=cardbalance-price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:"+cardbalance); }
        else if (item.equals("USB cable")){
            price+=10;
            cardbalance=cardbalance-price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:"+cardbalance); }
        else if (item.equals("Headphones")){
            price+=30;
            cardbalance=cardbalance-price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:"+cardbalance); }
        else if (item.equals("Pants")){
            price+=50;
            cardbalance=cardbalance-price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:"+cardbalance); }
        else if (item.equals("Hat")){
            price+=25;
            cardbalance=cardbalance-price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:"+cardbalance); }
        else if (item.equals("Socks")){
            price+=5;
            cardbalance=cardbalance-price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:"+cardbalance); }
        else if (item.equals("Blanket")){
            price+=60;
            cardbalance=cardbalance-price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:"+cardbalance); }
        else if (item.equals("Pillow")){
            price+=40;
            cardbalance=cardbalance-price;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is:"+cardbalance); }
        else {
            System.out.println("Invalid item!");
        }






    }
}
