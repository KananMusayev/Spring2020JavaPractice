package Rephlits;

import java.util.Scanner;

public class Rephlit011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int start = input.nextInt();
        int end = input.nextInt();
        String string = str.substring(start,end+1);
        System.out.println("The substring of "+str+" from "+start+" to "+end+" inclusive is "+string);




    }
}
