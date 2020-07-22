package SpecialTasks;

public class PasswordTask {


    public static void main(String[] args) {


        System.out.println(passwordverification("Alisa.1993"));
    }

    /*
    String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
     */
    public static boolean passwordverification(String password) {

        boolean character6 = false;
        boolean uppercase = false;
        boolean lowercase = false;
        boolean specialcharacter = false;
        boolean digit = false;
        boolean result = false;

        String a="Ahmed.2019";
        if (password.length() >= 6 && !password.contains(" ")) {
            character6 = true;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                uppercase = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowercase = true;
            }
            if (!Character.isDigit(password.charAt(i)) && !Character.isAlphabetic(password.charAt(i))) {
                specialcharacter = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                digit = true;
            }
        }
        if (character6 && uppercase && lowercase && specialcharacter && digit) {
            result = true;
        }
        return result;


    }


}
