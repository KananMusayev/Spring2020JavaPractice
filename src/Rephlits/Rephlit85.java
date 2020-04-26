package Rephlits;

import java.util.Scanner;

public class Rephlit85 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int itemnum=1;
        String result="";
        double totalprice =0;
        do {
            System.out.println("Enter Item"+itemnum+ " and its price:");
            String item1 = scan.next();
            double price1 = scan.nextDouble();
            result+="Item"+itemnum+": "+item1+" "+"Price: "+price1+", ";
            totalprice+=price1;
            System.out.println("Add one more item?");
            String answer = scan.next();
            itemnum++;
            if (answer.equals("yes")) {
                continue; }
            else if (answer.equals("no")) {
                result=result.substring(0,result.length()-2);
                System.out.println(result);
                System.out.println("Total price: "+totalprice);
                break; }
        }while (true);


        //            result=result.substring(0,result.length()-2);
    }
}
