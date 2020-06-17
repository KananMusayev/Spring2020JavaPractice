package Day46AbstractContinue;

public class FirefoxDriver extends RemoteWebDriver{

    @Override
    public void get(String URL){
        System.out.println("Opens the "+URL+" from fireFox browser");
    }
    @Override
    public void quit(){
        System.out.println("Closes the fireFox browser");
    }
}
