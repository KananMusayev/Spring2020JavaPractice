package ClassTasks;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Warmup1 {
    public static void main(String[] args) {
        /*
        write a program that asks user's first and last name,
         then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstname = input.next();
        System.out.println("Please enter your last name");
        String lastname = input.next();
        String empty = "";
        String firstletterfirstname=firstname.substring(0,1).toUpperCase();
        String firstletterlastname = lastname.substring(0,1).toUpperCase();
        empty+=firstletterfirstname+firstletterlastname;
        System.out.println(empty);
    }
}
