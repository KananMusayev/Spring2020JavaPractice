package Day12Scanner_Nextline;
import java.util.Scanner;

public class Nextline3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Write a program that accepts zip code,
        city,state,phone number and then display all
        those gathered information
        Dont use next() method
         */
        System.out.println("Whats your Zip code?");
        int zip = input.nextInt();
        input.nextLine();
        System.out.println("Whats your city name?");
        String city = input.nextLine();
        System.out.println("whats your phone number");
        int pn = input.nextInt();
        System.out.println("Enter the state name");
        input.nextLine();
        String state= input.nextLine();
        String all = "your zip code is : "+zip+"\n "+"your city is: "+city+"\n "+
                "your phone number is :"
                +pn+"\n "+"your state is : "+state;
        System.out.println(all);

    }
}
