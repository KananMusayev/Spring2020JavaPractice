package Rephlits;

import java.util.Scanner;

public class Assesment6point1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        s=s.toLowerCase();
        String empty="";
        for (int i=0;i<s.length();i++){
            if (i%2==0){
                empty+=s.substring(i,i+1);
            }
            else if (i%2!=0){
                empty+=s.substring(i,i+1).toUpperCase();
            }
        }
        System.out.println(empty);
    }
}

