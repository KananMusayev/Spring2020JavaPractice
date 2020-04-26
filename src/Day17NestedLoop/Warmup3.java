package Day17NestedLoop;

import java.util.Scanner;

public class Warmup3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        write a program that checks if String is palindrome
        it yes print :"true",
        otherwise print :"false"
        Do not use for loop
        Ex:
        input:level
        output:true,   (because reversed value is still "level")
        do it with while loop
         */
        String given = input.nextLine();
        int i = given.length()-1;
        String result ="";
        while(i>=0){

            result+=given.substring(i,i+1);
            //result+=given.charAt(i)



            i--;

        }
        System.out.println(result);
    }
}
