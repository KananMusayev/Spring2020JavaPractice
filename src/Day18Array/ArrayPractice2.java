package Day18Array;

import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Ask user to enter 5 nums and then ente
        the sum of those 5 nums
        must use ARRAY
         */
       /* int a =0;
        for (int i=0;i<5;i++){
            System.out.println("PLease enter a number");
            int c =input.nextInt();
            a+=c;


        }
        System.out.println(a);
*/
       int[] numbers = new int[10];
       for (int i =0;i<numbers.length;i++){
           System.out.println("Enter a num");
           numbers[i]=input.nextInt();
       }

       int sum=0;
        for (int i =0;i<numbers.length;i++){
        sum+=numbers[i]          ;
        }
        System.out.println(sum);
    }
}
