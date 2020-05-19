package CodingBat;

public class StoreProduct {

    String label;
    int price;
    String category="misc";
    boolean hasExpiration=false;
    int stock=0;

    public StoreProduct(String label,int price, boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.hasExpiration=hasExpiration;
        this.stock=stock;

    }

    public StoreProduct(String label,int price, int stock){
        this.label=label;
        this.price=price;
        this.stock=stock;

    }
    public StoreProduct(String label, int stock){

        this.label=label;

        this.stock=stock;


    }

    public StoreProduct(String label,int price, boolean hasExpiration,String category){
        this.label=label;
        this.price=price;
        this.hasExpiration=hasExpiration;

        this.category=category;
    }
    public StoreProduct(String label,int price, String category,boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
        this.category=category;
    }
    public StoreProduct(String label,int price, String category,boolean hasExpiration){
        this.label=label;
        this.price=price;
        this.hasExpiration=hasExpiration;

        this.category=category;
    }
    public void expired(boolean hasExpired){


            if(hasExpiration==true&&hasExpired==true){
                stock=0;
            }



    }


    public boolean sale(int quantity){
        boolean result=false;
        if (quantity<stock){
            stock=stock-quantity;
            result=true;
        }
        return result;
    }
    public double getDiscountedPrice(double discount){
            double result=0;
            result=price*(1-discount);
            return result;
    }






}
