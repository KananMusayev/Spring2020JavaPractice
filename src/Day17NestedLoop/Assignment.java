package Day17NestedLoop;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            should ask which bedroom do you wanna reserve
            if user provided invalid entry => please re-enter
            calculate the total price
            do you want to reserve another room
            if yes ==> repeat the previous steps
            if no ==> your total price is: $$$
            if answer either yes or no ==> please re-enter
     */
        int total=0;
        while (true) {
            System.out.println("Which bedroom would u like to reserve?");
            String bedroomtype = input.nextLine();
            if (bedroomtype.equalsIgnoreCase("King Bed")) {
                total += 120;
            } else if (bedroomtype.equalsIgnoreCase("Queen Bed")) {
                total += 100;
            } else if (bedroomtype.equalsIgnoreCase("Single Bed")) {
                total += 80; }
            System.out.println("Do you want to reserve another room?");
            String answer = input.next();

            while (!(answer.equalsIgnoreCase("yes"))||answer.equalsIgnoreCase("no")) {

                System.out.println("Invalid Entry");
                System.out.println("Please enter yes or no");
                answer=input.next();
            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Your Total is " + total);

                System.out.println("Thanks for using ");
                break; }
        }
    }}
