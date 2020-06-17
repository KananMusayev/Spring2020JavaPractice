package Day48PolymorphismIntro;

public class Nokia extends Phone implements AndroidApps{

    static {
        brand="Android";
    }
    public Nokia(String model,double price,String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }

    @Override
    public void download() {
        System.out.println("Nokia is downloading apps from "+AppStoreName);

    }


    public  void freezing(){
        System.out.println("Nokia is freezing");
    }
    public void breakTheFloor(){
        System.out.println("Nokia is breaking the floor");
    }

    @Override
    public void texting(long number) {
        System.out.println("Nokia is texting " +number);
    }

    @Override
    public void calling(long number) {
        System.out.println("Nokia is calling "+number);
    }

    public String toString(){
        return "brand "+brand +" model "+model+" price "+price+" brand "+size;

    }


}
