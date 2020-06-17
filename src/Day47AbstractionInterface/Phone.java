package Day47AbstractionInterface;

public abstract class Phone {

    public static String brand;
    public String model;
    public int price;
    public String  size;

    public abstract void calling(long phoneNumber);

    public abstract void texting(long phoneNumber);

    public String toString(){
        return brand+" "+model+" "+price+" "+size;
    }
}
 class Iphone extends Phone{
        static {
            brand="iPhone";
        }


    public Iphone(String model, int price, String  size){

        this.model=model;
        this.price=price;
        this.size=size;
    }



     @Override
     public void calling(long phoneNumber) {
         System.out.println(brand+" is calling with "+phoneNumber);
     }


     @Override
     public void texting(long phoneNumber) {
         System.out.println(brand+" is texting with "+phoneNumber);

     }
 }
 class Samsung extends Phone{

    static {
        brand="Samsung";
    }
     public Samsung(String model,int price, String  size){
         this.model=model;
         this.price=price;
         this.size=size;
     }

     @Override
     public void calling(long phoneNumber) {
         System.out.println(brand+" is calling with "+phoneNumber);

     }

     @Override
     public void texting(long phoneNumber) {
         System.out.println(brand+" is texting with "+phoneNumber);

     }
 }


