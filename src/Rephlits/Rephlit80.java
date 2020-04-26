package Rephlits;

import java.util.Scanner;

public class Rephlit80 {
    public static void main(String[] args) {
        /*
        Online Book Merchants offers premium customers
         1 free book with every purchase of 5 or more
         books and offers 2 free books with every purchase
          of 8 or more books. It offers regular customers
          1 free book with every purchase of 7 or more books,
           and offers 2 free books with every purchase of 12
           or more books.
     Write a program that assigns freeBooks the appropriate
      value based on the values of the boolean variable
       isPremiumCustomer and the int variable nbooksPurchased.
        Print amount of freeBooks into the console.
         */
        Scanner scan = new Scanner(System.in);

        int freebooks =0;
        boolean isPremiumCustomer =scan.nextBoolean();
        int bookspurchased =scan.nextInt();

        if (isPremiumCustomer){
            if (bookspurchased>=5&&bookspurchased<8){
                freebooks+=1; }
            else if (bookspurchased>=8){
                freebooks+=2; }
        }else if (!isPremiumCustomer){
            if (bookspurchased>=7&&bookspurchased<12){
                freebooks+=1; }
            else if (bookspurchased>=12){
                freebooks+=2; } }
        System.out.println(freebooks);
    }
}
