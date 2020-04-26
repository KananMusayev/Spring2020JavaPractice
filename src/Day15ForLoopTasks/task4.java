package Day15ForLoopTasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        //finding minimum number
        Scanner input = new Scanner(System.in);

        int min = 99999999;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number");
            int inputnum = input.nextInt();
            if (inputnum < min) {
                min = inputnum;
            }
        }
        System.out.println(min);
    }
}
