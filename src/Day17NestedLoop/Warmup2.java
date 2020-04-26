package Day17NestedLoop;

import java.util.Scanner;

public class Warmup2 {
    public static void main(String[] args) {
        /*
        write a program that checks if String is palindrome
        it yes print :"true",
        otherwise print :"false"
        Do not use for loop
        Ex:
        input:level
        output:true,   (because reversed value is still "level")

         */
        //palindrome is if the reverse value of the word
        //is same then it is palindrome. EX:abba==>abba or level==>level
        //do it with for loop first

        Scanner input =new Scanner(System.in);
        String original=input.next() ;
        //index          0123456

        // reverse       6543210
        String reverse="";   //"gfedcba"
        for (int i =original.length()-1;i>=0;i--){
            reverse+=original.substring(i,i+1);} // or original.charAt(i)}
        boolean result = original.equals(reverse)?true:false;
        System.out.println(result);
        System.out.println(reverse);

        //now do it with while loop








    }
}
