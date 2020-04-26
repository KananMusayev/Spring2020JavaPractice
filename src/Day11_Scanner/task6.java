package Day11_Scanner;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Assignment:
            write me a programk that asks the user fiurt and last names,
             then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */

        System.out.println("Please enter your first name:");
        String firstName=input.nextLine();
        System.out.println("Please enter your Last name:");
        String lastName = input.nextLine();
        System.out.println(firstName.charAt(0)+"."+lastName.charAt(0));


    }
}
