package Rephlits;

public class Rephlit73 {
    public static void main(String[] args) {
        /*
        Write a program that will print out information about
        the user based on email. Print first and last name from
        the email with the upper case. (Assume that first and
        last names were separated by an underscore)
Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
         */

        String email="craig_federighi@apple.com";
        int indexofunderscore= email.indexOf("_");
        int indexofAt = email.indexOf("@");
        int indexofDot=email.indexOf(".");

        String FirstName = email.substring(0,indexofunderscore);
        String LastName = email.substring(indexofunderscore+1,indexofAt);
        String  Domain = email.substring(indexofAt+1,indexofDot);
        String TopLevelDomain = email.substring(indexofDot+1,email.length());
        System.out.println("First name: "+FirstName);
        System.out.println("Last name: "+LastName);
        System.out.println("Domain: "+Domain);
        System.out.println("Top-Level Domain: "+TopLevelDomain);

    }
}
