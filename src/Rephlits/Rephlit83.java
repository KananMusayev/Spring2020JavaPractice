package Rephlits;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

public class Rephlit83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result="";
        while(true){
        System.out.println("Please enter guest name:");
        String name=input.next();
        result+=name+", ";
        System.out.println("Do you want to enter new guest name:");
        String answer=input.next();
        if (answer.equalsIgnoreCase("no")){
            result=result.substring(0,result.length()-2);
            System.out.println("Guest's list: "+result);
            break; }
        else if (answer.equalsIgnoreCase("yes")){
            continue;
        }}

    }
}
