package Rephlits;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        if (word.substring(word.length()-2).equals("ey")){
            System.out.println("-eys");//-eys
        }
        else if (word.substring(word.length()-1).equals("y")){
            System.out.println("-ies");
        }
        else if (word.endsWith("ife")){
            System.out.println("-ives");
        }
        else {
            System.out.println("-s");
        }

    }
}
