package Rephlits;

import java.util.Scanner;

public class Rephlit76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String start = input.next();
        String end = input.next();
        String right = "right";
        String left = "left";
        String down = "down";
        String up = "up";
        String sign = " > ";
        String Afound = ": A found";
        String Bfound = ": B found";
        String Cfound = ": C found";
        String Dfound = ": D found";
        if (start.equalsIgnoreCase("A")&&end.equalsIgnoreCase("b")){
            System.out.println(right+Bfound); }
        else if (start.equalsIgnoreCase("A")&&end.equalsIgnoreCase("c")){
            System.out.println(right+sign+down+Cfound); }
        else if (start.equalsIgnoreCase("A")&&end.equalsIgnoreCase("D")){
            System.out.println(right+sign+down+sign+left+Dfound); }
        else if (start.equalsIgnoreCase("A")&&end.equalsIgnoreCase("A")){
            System.out.println("A found"); }

        if (start.equalsIgnoreCase("b")&&end.equalsIgnoreCase("c")){
            System.out.println(down+Cfound); }
        else if (start.equalsIgnoreCase("b")&&end.equalsIgnoreCase("d")){
            System.out.println(down+sign+left+Dfound); }
        else if (start.equalsIgnoreCase("b")&&end.equalsIgnoreCase("a")){
            System.out.println(down+sign+left+sign+up+Afound); }
        else if (start.equalsIgnoreCase("b")&&end.equalsIgnoreCase("b")){
            System.out.println("B found"); }


        if (start.equalsIgnoreCase("c")&&end.equalsIgnoreCase("d")){
            System.out.println(left+Dfound); }
        else if (start.equalsIgnoreCase("c")&&end.equalsIgnoreCase("a")){
            System.out.println(left+sign+up+Afound); }
        else if (start.equalsIgnoreCase("c")&&end.equalsIgnoreCase("b")){
            System.out.println(left+sign+up+sign+right+Bfound); }
        else if (start.equalsIgnoreCase("c")&&end.equalsIgnoreCase("c")){
            System.out.println("C found"); }

        if (start.equalsIgnoreCase("d")&&end.equalsIgnoreCase("a")){
            System.out.println(up+Afound); }
        else if (start.equalsIgnoreCase("d")&&end.equalsIgnoreCase("b")){
            System.out.println(up+sign+right+Bfound); }
        else if (start.equalsIgnoreCase("d")&&end.equalsIgnoreCase("c")){
            System.out.println(up+sign+right+sign+down+Cfound); }
        else if (start.equalsIgnoreCase("d")&&end.equalsIgnoreCase("d")){
            System.out.println("D found"); }


    }
}
