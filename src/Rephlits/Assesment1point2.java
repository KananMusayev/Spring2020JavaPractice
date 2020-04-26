package Rephlits;

public class Assesment1point2 {
    public static void main(String[] args) {
        /*
        In this problem you need to write a program that checks for the bigger of 3 numbers.

You are given 3 int variables: num1 , num3 and num3.

if num1 is biggest - output: "n1 is bigger"
if num2 is biggest - output: "n2 is bigger"
if num3 is biggest - output: "n3 is bigger"

         */
        int num1=6;
        int num2 =5;
        int num3=7;
        if (num1>num2&&num1>num3){
            System.out.println("n1 is bigger"); }
        else if (num2>num1&&num2>num3){
            System.out.println("n2 is bigger"); }
        else if(num3>num2&&num3>num1){
            System.out.println("n3 is bigger");
        }
    }
}
