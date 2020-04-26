package Rephlits;

import java.util.Scanner;

public class Rephlit30shoppinglist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();
        double totalprice=0;
        String noneed = "";
        if (count1>0){
            totalprice+=price1*count1;
            noneed+="Item1: "+item1+" Price: "+price1*count1+", ";}
        if (count2>0){
            totalprice+=price2*count2;
            noneed+="Item2: "+item2+" Price: "+price2*count2;}
        if (count3>0){
            totalprice+=price3*count3;
            noneed+="Item3: "+item3+" Price: "+price3*count3;}
        System.out.println(noneed);
        System.out.println("Total price: "+totalprice);








    }
}
