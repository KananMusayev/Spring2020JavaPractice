package Day11_Scanner;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*write a java program that can convert any given numbers
        between 0 ~ 9 to words, if the number is greater
         than 9 or less than zero, out put should be "Invalid".
         */

        int day = 12;
        switch (day){
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            case 4 :
                System.out.println("four");
                break;
            case 5 :
                System.out.println("five");
                break;
            case 6 :
                System.out.println("six");
                break;
            case 7 :
                System.out.println("seven");
                break;
            case 8 :
                System.out.println("eight");
                break;
            case 9 :
                System.out.println("nine");
                break;
            default:
                System.out.println("Invalid");

        }



    }
}
