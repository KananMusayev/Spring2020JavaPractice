package Day23JavaRecap;

public class Warmup {
    public static void main(String[] args) {
        /*
        1. write a return method named getDriver1 that accepts a string parameter called Browser
            if the browser name matches with {"chrome", "firefox", "ie", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
                Ex: getDriver("chrome");  ==> "Chrome Driver"
                    getDriver("fireFOX"); ==> "FireFox Driver"
                        ....
            if the browser name does not match with any of browsers above, the method should return "Invalid driver"
            APPLY SWITCH STATEMENTS
         */

    }
    public static String Browser(String a) {

        if (a.equalsIgnoreCase("chrome")) {
            return "Chrome Driver";
             }
        else if (a.equalsIgnoreCase("firefox")) {
            return  "Firefox Driver";
             }
        else if (a.equalsIgnoreCase("ie")) {
            return "Ie Driver";
            }
        else if (a.equalsIgnoreCase("safari")) {
            return "Safari Driver";
             }
        else if (a.equals("edge")) {
            return  "Edge Driver";
             }
        else if (a.equals("opera")) {

            return "Opera Driver"; }
        else {
            return "invalid";
        }

    }

}
