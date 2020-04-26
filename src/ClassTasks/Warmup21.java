package ClassTasks;

import java.util.Scanner;

public class Warmup21 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String  n=input.next();
        /*
        Check if the string word is palindrome?
        abba==>abba or level==>level
         */
        String empty="";
        for (int i=n.length()-1;i>=0;i--){
            empty+=n.charAt(i);
        }
        if (empty.equals(n)){
            System.out.println(true);
        }
        else {System.out.println(false);
        }
    }
}
