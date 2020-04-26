package Day16DoWhileLoops;

import java.util.Scanner;

public class Whileloop6Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Starting number");
        int start = input.nextInt();
        System.out.println("Ending number");
        int end =input.nextInt();

        for (int i = start; i<end;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }


        }



    }

