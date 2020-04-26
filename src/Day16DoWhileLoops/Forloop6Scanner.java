package Day16DoWhileLoops;

import java.util.Scanner;

public class Forloop6Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Starting number");
        int start = input.nextInt();
        System.out.println("Ending number");
        int end =input.nextInt();
        int a =start;
        while (a <= end){
            if (a%2==0){
                System.out.println(a+"");
            }
            a++;

    }
}}
