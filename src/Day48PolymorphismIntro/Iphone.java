package Day48PolymorphismIntro;

public final class Iphone extends Phone implements AppleApps {

    static {
        brand="Apple";
    }

    public Iphone(String model,double price,String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading apps from "+AppStoreName);
    }

    @Override
    public void texting(long number) {
        System.out.println("Iphone is texting "+number);
    }

    @Override
    public void calling(long number) {
        System.out.println("Iphone is calling "+number);

    }

    public void facetiming(long number){
        System.out.println("Iphone is facetiming "+number);
    }

}
