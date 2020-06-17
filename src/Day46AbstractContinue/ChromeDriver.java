package Day46AbstractContinue;

import com.sun.jndi.toolkit.url.Uri;

public class ChromeDriver extends RemoteWebDriver{

    @Override
    public void get(String URL){
        System.out.println("Opening "+ URL+" in chrome browser");
    }
    @Override
    public void quit(){
        System.out.println("Closing the Chrome driver");
    }

}
