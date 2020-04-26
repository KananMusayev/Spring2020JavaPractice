package Examples;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*

        valid credentials are:
            username: cybertek
            password: cybertekschool
        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
         */

        System.out.println("enter a username:");
        String username = input.nextLine();
        System.out.println("enter the password:");
        String password = input.nextLine();
        //if (username.equalsIgnoreCase("cybertek") && password.equalsIgnoreCase("cybertekschool"))
         //   System.out.println("logged in");
        //else if (password.equalsIgnoreCase("cybertekschool") && username != "cybertek") ;
         //   System.out.println("username is incorrect");
         //   else if (username.equalsIgnoreCase("cybertek") && password != "cybertekschool") ;
          //  else
           //     System.out.println("invalid username and password");
        if (username.equalsIgnoreCase("cybertek") && password.equalsIgnoreCase("cybertekschool")){
            System.out.println("Logged in"); }
        else if (password.equalsIgnoreCase("cybertekschool") && username != "cybertek"){
            System.out.println("username is incorrect"); }
        else if (username.equalsIgnoreCase("cybertek") && !username.equalsIgnoreCase("")){
            System.out.println("password is incorrect"); }
        else {
            System.out.println("invalid username and password"); }





    }
}
