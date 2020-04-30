package Day11Scanner;
import java.util.Scanner;

public class ScannerTask3 {
    public static void main(String[] args) {

        /*
        write a program that asks use to enter first name and
        then last name.
        At the end system should display user's full name

         */
        Scanner input=new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstname=input.nextLine();
        System.out.println("Whats your last name?");
        String lastname=input.nextLine();
        String Fullname = lastname+" "+firstname;
        System.out.println("Your full name is : "+Fullname);

 input.close();
    }
}
