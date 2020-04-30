package Day11Scanner;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Byte Value");
        byte num= input.nextByte();
        System.out.println("Enter Short value");
       short num2=input.nextShort();
        System.out.println("Enter Int value");
        int num3 =input.nextInt();
        System.out.println("Enter Long value");
        long num4 = input.nextLong();
        System.out.println("Enter Boolean value");
        boolean num5 = input.nextBoolean();
        System.out.println("Enter Float value");
        float num6 = input.nextFloat();
        System.out.println("Enter Double value");
        double num7 = input.nextDouble();
        System.out.println("Enter your first name");
        String str = input.nextLine();







    }
}
