package Examples;

import java.util.Scanner;

public class noneed3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word ="xxjava";
        if (word.length() < 4){
            System.out.println("false");
        } else if (word.length() >=4 && word.startsWith("java") || word.substring(1).startsWith("java") ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }}
