package Day45Exceptions;

public class Browsers {

    public void OpenBrowser(){
        System.out.println("Opens the default browser");
    }
    public void CloseBrowser(){
        System.out.println("Closes the default browser");
    }
}
class ChromeBrowser extends Browsers{
    @Override
    public void OpenBrowser(){
        System.out.println("Opens Chrome browser");
    }
    @Override
    public void CloseBrowser(){
        System.out.println("Closes Chrome browser");
    }

}
class FirefoxBrowser extends Browsers {
    @Override
    public void OpenBrowser() {
        System.out.println("Opens Firefox browser");
    }

    @Override
    public void CloseBrowser() {
        System.out.println("Closes Firefox browser");
    }
}
class OperaBrowser extends Browsers {
    @Override
    public void OpenBrowser() {
        System.out.println("Opens Opera browser");
    }

    @Override
    public void CloseBrowser() {
        System.out.println("Closes Opera browser");
    }
}
class Test{
    public static void main(String[] args) {

        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.OpenBrowser();
        chromeBrowser.CloseBrowser();
        FirefoxBrowser firefoxBrowser=new FirefoxBrowser();
        firefoxBrowser.OpenBrowser();
        firefoxBrowser.CloseBrowser();
        OperaBrowser operaBrowser=new OperaBrowser();
        operaBrowser.OpenBrowser();
        operaBrowser.CloseBrowser();

    }
}
