package Day40Inheritance;



class TestBase {//sub class
    static String chromeDriver;//default access modifier
    public static void TakeScreenshot() {
        System.out.println("Took screenshot");}
    private static void closeBrowser() {//its private which means is not visible and it is not inheritable
        System.out.println("Browser closed");}
}
public class Inhetirance extends TestBase {//super class
    public static void main(String[] args) {
        System.out.println(chromeDriver);
        TakeScreenshot();}
}



