package Rephlits;

public class StoreProduct {

    String label;
    int price;
    String category="misc";
    boolean hasExpiration=false;
    int stock=0;

    public StoreProduct(){//default

    }
    public StoreProduct(String label,int price,String category,boolean hasExpiration,int stock){//no category

        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;

    }
    public StoreProduct(String label,int price,boolean hasExpiration,int stock){//no category

    }

    public StoreProduct(String label,int price,String category,int stock){//no expiration

    }
    public StoreProduct(String label,int price,String category,boolean hasExpiration){//no stock

    }

    public void expired(boolean hasExpired){
        if (hasExpired==true){
            stock=0;
        }
    }
    public boolean sale(int quantity){
        boolean sale=false;
        if (quantity<=stock){
            stock-=quantity;
            sale=true;
        }
        return sale;
    }
    public double getDiscountedPrice(double discount){
       return price*(1-discount);
    }



}

class Main{
    public static void main(String[] args) {
        StoreProduct obj1=new StoreProduct("Label",20,true,5);
        StoreProduct obj2=new StoreProduct("ABC",20,"shoes",3);
        StoreProduct obj3=new StoreProduct();
        StoreProduct obj4=new StoreProduct("dadfwf",30,"hkadfkdh",false);

    }
}
