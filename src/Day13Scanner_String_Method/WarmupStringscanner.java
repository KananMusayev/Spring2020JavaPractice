package Day13Scanner_String_Method;
import java.util.Scanner;

public class WarmupStringscanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name ");
      String FirstName =  input.nextLine();
      String LastName  =  input.nextLine();
        String FullName=FirstName.concat(" "+LastName);
        int num = FullName.length();
        System.out.println(FullName+" contains "+num + " characters");


    }
}
