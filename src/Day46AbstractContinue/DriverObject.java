package Day46AbstractContinue;

import com.sun.jndi.toolkit.url.Uri;

public class DriverObject {

    public static void main(String[] args) {
        String URL="https://gmail.com";
        ChromeDriver driver=new ChromeDriver();
                    driver.get(URL);
                    driver.quit();
        FirefoxDriver firefoxDriver=new FirefoxDriver();
                    firefoxDriver.get(URL);
                    firefoxDriver.quit();
        OperaBrowser operaBrowser =new OperaBrowser();
                    operaBrowser.get(URL);
                    operaBrowser.quit();

    }
}
