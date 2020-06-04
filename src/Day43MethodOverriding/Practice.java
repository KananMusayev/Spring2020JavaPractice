package Day43MethodOverriding;


class WebDriver{

    public  void get(){
        System.out.println("Opens Browser");
    }
}

class ChromeDriver extends WebDriver{
    @Override
    public String toString() {
        return super.toString();
    }

    public void get(){
        System.out.println("Opens Chrome");
    }
}

class FirefoxDriver extends WebDriver{
    @Override
    public void get(){
        System.out.println("Opens the Firefox Driver");
    }

}

public class Practice {
    public static void main(String[] args) {
        ChromeDriver driver1=new ChromeDriver();
                         driver1.get();//"Opens Chrome"

        FirefoxDriver driver2=new FirefoxDriver();
                         driver2.get();//opens firefox

        final int num;
        num=100;
       // num=200;final variable can only be assigned once


    }

}


final class Erhan{//immutable-can not be inherited to other classes

}

//class Madina extends Erhan{}
