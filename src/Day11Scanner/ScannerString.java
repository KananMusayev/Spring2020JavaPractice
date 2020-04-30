package Day11Scanner;
import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String str = "Cybertek";
        String A = "Cybertek";
        String B = "Cybertek";
        System.out.println(A==B);//both of them stored at String pool
String str2 = new String("Cybertek");
        System.out.println(str==str2);// stored in different memory locations
String str3 = new String("Cybertek");
        System.out.println(str2==str3);

    }
}
