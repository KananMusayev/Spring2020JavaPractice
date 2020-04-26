package Rephlits;

import java.util.Scanner;

public class Rephlit074SMSmessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String message = input.nextLine();
        int indexofbigger=message.indexOf(">");
        int indexofsmaller=message.indexOf("<");
        int indexofI=message.indexOf("[");
        int indexofII=message.indexOf("]");
        int indexofbrace=message.indexOf("{");
        int indexofbraces=message.indexOf("}");
        String Person = message.substring(indexofsmaller+1,indexofbigger);
        String number =message.substring(indexofI+1,indexofII);
        String messagebody = message.substring(indexofbrace+1,indexofbraces);

        System.out.println("Sender: "+Person);
        System.out.println("Phone Number: "+number);
        System.out.println("Message body: "+messagebody);


    }
}
