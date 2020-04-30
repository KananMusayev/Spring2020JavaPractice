package Day12Scanner_Nextline;
import java.util.Scanner;

public class Nextline2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your phone number:");
        int pn = input.nextInt();
        System.out.println(pn);
        input.nextLine();

        System.out.println("Enter your name:" );
        String name = input.nextLine();
        /*
        next line methods will take everything in scanners memory
        up to the new line. yegane metoddurki enteride ozuynen biyerde
        basib aparir
         */




    }
}
