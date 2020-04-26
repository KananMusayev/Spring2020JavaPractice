package Day12_Scanner_Nextline;
import java.util.Scanner;

public class Example {
        public static void main(String[] args) {
        /*
        Write a program that asks user to input int values:
         areaCode and localNumber.
-Using concatenation put together in this format and
 assign to String phoneNumber  variable:
-(222)-3334444
-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444
         */
        Scanner input = new Scanner(System.in);
        String areaCode=input.nextLine();
        String localNumber=input.nextLine();
        String phoneNumber = "("+areaCode+")"+"-"+localNumber;
        System.out.println("Calling number "+phoneNumber);






    }
}
