package Day15ForLoopTasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        for (int i=1;i<=10;i++){
            System.out.println("Enter a number");
            int inputnum = input.nextInt();
            if (inputnum>max){
                max=inputnum;
            }
        }
        System.out.println(max);



    }
}
