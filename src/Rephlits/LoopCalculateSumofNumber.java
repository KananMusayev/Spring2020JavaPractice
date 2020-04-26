package Rephlits;

import java.util.Scanner;

public class LoopCalculateSumofNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        calculate the sum of all the numbers up to the n variable.
for example:
n=3
sum = 1+2+3 = 6
n = 5
 sum = 1+2+3+4+5 = 15
hint: use a loop
         */
        int n=input.nextInt();
        int sum = 0;
        for (int i=1;i<n;i++){
            sum+=i;
            System.out.println(sum);
        }
    }
}
