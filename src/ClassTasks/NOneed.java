package ClassTasks;

import java.util.Scanner;

public class NOneed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String given = input.nextLine();

        //Ex:AABCBCA==>A3B2C2
        int count = 0;
        String empty = "";

        for (int k = 0; k <= given.length() - 1; k++) {
            for (int i = 0; i <= given.length() - 1; i++) {
                if (given.charAt(i) == given.charAt(k)) {
                    count++;
                }
            }
            if (count > 1) {
                empty += count +" "+ given.charAt(k);
            }


        }
        System.out.println(empty);
    }
        }
