package Day11_Scanner;

import javax.sound.midi.Soundbank;

public class StringMethod {
    public static void main(String[] args) {
        String str =   "Cybertek";
        //index number :01234567
        //charAt(index)
        System.out.println(str.charAt(4));
        char ch = str.charAt(4);
        String str2 = "Mu htar";
        //indexx num = 0123456
        System.out.println(str2.charAt(2));


        //length():


        String name = "Donald Trump";
        System.out.println(name.length());//shows how many characters it has
        int n = name.length();


        //concat():

            String s1 = "Cybertek";
            s1.concat(" school");//attempt to modify String s1
        // returns brand new String value
        System.out.println(s1);//string is immutable ==>Cybertek
         s1 = s1.concat(" School");//Cybertek School
        System.out.println(s1);


        //toupperCase:

        String N = "cybertek";
        N.toUpperCase();
        System.out.println(N);
      N=  N.toUpperCase();//has to be assigned in order to be counted
        System.out.println(N);


        //toLowerCase();


        String C = "AZERBAIJAN";
        C.toLowerCase();
        System.out.println(C);
        C=C.toLowerCase();
        System.out.println(C);


        // Review all we learned on top

         String a = "Batch 12 Javengers";
        System.out.println(a.charAt(13));
         char b=a.charAt(10);
        System.out.println(b);
        int k=a.length();
        System.out.println(k);


        // trim(): used for removing the unused spaces
        //  returns a new string value
        String a1 = "                   hello            ";
        a1.trim();
        System.out.println(a1);
        a1 = a1.trim();
        System.out.println(a1);
        String a2 = "Cybertek             School";
        a2=a2.trim();
        System.out.println(a2);

        String a3 = "  ";
        a3=a3.trim();
        System.out.println(a3);

        String a4 = "          Cybertek        School";
        a4 = a4.trim();
        System.out.println(a4);

        /*
        substring(beginning index):
        it creates the sub value of the String from the beginning index
        till the last index and
        returns it as a new String value
         */

        String Str = "Cybertek School";
        //            0123456789
        String Str2 = Str.substring(9);
        System.out.println(Str2);// School
        String address = "Mclean,Va 22000";
        //                012345678910
        String zipcode =address.substring(10);
        System.out.println(zipcode);
        /*
        substring(beginning index,ending index):
          it creates the sub value of the String from
          the beginning index till the ending index(end index is excluded)
          then returns it as a new string value
         */
            String Name = "Hello Cybertek School";
            //             0123456
            String SubName = Name.substring(6,13);//"Cyberte"
        System.out.println(SubName);

            String Fullname = "Cybertek School Batch12";
            //                 0123456789
            String middleName = Fullname.substring(9,14+1);
        System.out.println(middleName);




    }
}
