package ClassTasks;

import java.util.Scanner;

public class stars {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        for (int k=0;k<n;k++){
        for (int i=k;i<n;i++){
            System.out.print("*");
        }
            System.out.println();}
    }
}
