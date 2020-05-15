package InteviewquestionsPractice;

import java.util.ArrayList;

public class DivisableNumbers {
    public static void main(String[] args) {
        /*
        Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
         */

        ArrayList<Integer> divisableby15=new ArrayList<>();
        ArrayList<Integer> divisableby3=new ArrayList<>();
        ArrayList<Integer> divisableby5=new ArrayList<>();

        for (int i=1;i<=100;i++){
            if (i%3==0&&i%5==0&&i%15==0){
                divisableby15.add(i);
            }
            else if (i%3==0&&i%15!=0){
                divisableby3.add(i);
            }
            else if (i%5==0&&i%15!=0){
                divisableby5.add(i);
            }
        }
        System.out.println(divisableby3);
        System.out.println(divisableby5);
        System.out.println(divisableby15);
    }
}
