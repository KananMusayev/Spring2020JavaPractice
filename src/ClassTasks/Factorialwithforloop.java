package ClassTasks;

import java.util.Scanner;

public class Factorialwithforloop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int a=1;

        for (int i =1;i<=n;i++){
            a=a*i;
        }
        System.out.println(a);
    }
}
