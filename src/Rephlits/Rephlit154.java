package Rephlits;

import java.util.Scanner;

public class Rephlit154 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String  A=String.valueOf(num);
        String emtpy="";
        int k=0;
        for (int i=A.length()-1;i>=0;i--){
            emtpy+=A.charAt(i);
        }
        if (emtpy.equals(A)){
            System.out.println(true);
        }
        else if (!(emtpy.equals(A))){
            System.out.println(false);
        }
    }

    }
