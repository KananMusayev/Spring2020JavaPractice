package Day11Scanner;

import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {


    /*next vs nextline();
    public static void main(String[] args) {
        */


    Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname = scan.nextLine();
        System.out.println(firstname);
        System.out.println("Enter your last Name");
        String lastname = scan.nextLine();
        System.out.println(lastname);
        System.out.println("First name is : " +firstname);
        System.out.println("Last name is : "+lastname);

        System.out.println("Enter char value");
        char ch = scan.next().charAt(0);
    }}

