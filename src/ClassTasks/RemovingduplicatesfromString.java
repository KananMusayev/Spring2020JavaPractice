package ClassTasks;

import java.util.Scanner;

public class RemovingduplicatesfromString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*
         write a program that can remove
         duplicated characters from a string
         abcdabcd ==> abcd
         */
        String empty="";
        String given=input.nextLine();

            for (int i = 0; i < given.length(); i++) {
                if (!empty.contains(given.substring(i,i+1))){
                    empty+=given.substring(i,i+1);
                }
            }
        System.out.println(empty);
    }
}
