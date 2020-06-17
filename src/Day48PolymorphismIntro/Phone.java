package Day48PolymorphismIntro;

interface downloadable {


    boolean downloadable=false;
    void download();
}
interface AndroidApps extends downloadable {

    String AppStoreName ="Android";
}

interface AppleApps extends downloadable{

    String AppStoreName = "Apple";

}

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String  size;

    public abstract void texting(long number);
    public abstract void calling(long number);


    public String toString(){
        return "brand "+brand +" model "+model+" price "+price+" brand "+size;
    }




}
