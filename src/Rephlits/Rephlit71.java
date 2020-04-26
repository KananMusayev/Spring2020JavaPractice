package Rephlits;

public class Rephlit71 {
    public static void main(String[] args) {
        /*
        In this task, you need to swap the first name with the last name in the email.
         If the email doesn't contain underscore - do not do anything.
Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
         */
        String email="barak_obama@gmail.com";
        String NewEmail="";
        int indexofunderscore=email.indexOf("_");
        int indexofAt = email.indexOf("@");
        if (email.contains("_")){

            NewEmail+=email.substring(indexofunderscore+1,indexofAt);
            NewEmail+="_";
            NewEmail+=email.substring(0,indexofunderscore);
            NewEmail+=email.substring(indexofAt,email.length());
            System.out.println(NewEmail); }
        else if (!email.contains("_")){
            System.out.println(email);
        }


    }
}
