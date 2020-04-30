package Day12Scanner_Nextline;
import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name: ");
        String FirstName = input.nextLine();
        String LastName = input.nextLine();

        String fullname = FirstName.concat(" "+LastName).toUpperCase();

        System.out.println(fullname);

    }
}
