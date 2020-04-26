package Day14ForLoop;
import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "cybertek.batch12@gmail.com";
        String parol = "Javengers";
        System.out.println("Please enter your email:");
        String username1 = input.nextLine().toLowerCase();
        System.out.println("Please enter your password:");
        String password = input.nextLine();
        if (username1.endsWith("@gmail.com")){
            if (username1.equalsIgnoreCase(username)&&password.equals(parol)){
            System.out.println("loged in succesfully"); }
            else {
                System.out.println("invalid username or password"); }}
        else {
            System.out.println("it is not a valid email"); }








    }
}
