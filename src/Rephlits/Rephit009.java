package Rephlits;

public class Rephit009 {
    public static void main(String[] args) {
        /*
        (all output should be one per line)
On line 6, write a print statement that prints out a substring of str
starting at index 5 and going to the end
On line 7, write a print statement that prints out a substring of str
starting at index 7 and ending at index 10
On line 10, fill in the () in substring so that it prints "harambe"
On line 11, fill in the () in substring so that it prints "t f"
         */

        String str = "laptops out for harambe";
         System.out.println(str.substring(str.indexOf("h")));
        // fill in substring so it prints "harambe"
        // fill in substring so it prints "t f"
        //
        System.out.println(str.substring(3,4)+" "+str.substring(12,13));
        System.out.println(str.substring(5));
        System.out.println(str.substring(7,10));
        //System.out.println(str.substring(str.indexOf("t"),str.indexOf("o"))+" "+str.substring(str.indexOf("f"),str.indexOf("o")));

    }
}
