package ClassTasks;

public class hast {
    String size;
    int CheeseTop;
    int PepToop;
    public void cutomerOrder(String sizing, int cheese, int pepperoni){
        size = sizing;
        CheeseTop = cheese;
        PepToop = pepperoni;
    }
    public  double  calcost (){
        if (size.equalsIgnoreCase("small")){
            return 10 +(PepToop*1.5) + CheeseTop;
        }else if (size.equalsIgnoreCase("medium")){
            return 12 +(PepToop*1.5) + CheeseTop;
        }
        return 14 +(PepToop*1.5) + CheeseTop;
    }
    public String toString (){
        return "Pizza size: "+size+", "+PepToop+" Pepperoni toppings, and "+
                CheeseTop+" Cheese topping, Total cost: "+calcost();
    }
}
