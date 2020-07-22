package ClassTasks;

import java.util.Scanner;

public class Tasknew {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        for (int i=0;i<5;i++){

            String a=input.nextLine();
            System.out.println(a.substring(0,3));
        }

    }
}
