package Day46AbstractContinue;

public class OperaBrowser extends RemoteWebDriver {
    @Override
    protected void get(String URL) {
        System.out.println("Opens the "+URL+" from Opera browser");

    }

    @Override
    public void quit() {
        System.out.println("Closes the Opera browser");

    }
}
