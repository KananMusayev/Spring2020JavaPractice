package ClassTasks;

import java.util.Scanner;

public class Rephlit33 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        /*
        check if the word is palindrome or not
        ex:level-->level
        abba-->abba
         */
        s=s.replace(" ","");
        String empty="";

        for (int i=s.length()-1;i>=0;i--){
            empty+=s.charAt(i);
        }

        empty=empty.replace(" ","");


         if (empty.equalsIgnoreCase(s)){
            System.out.println(true);
        }
        else if (!empty.equalsIgnoreCase(s)){
            System.out.println(false);
        }


    }
}
