package Day34Class_ObjectContinue;

public class Pizza {

    String size;
    double cheesetopping;
    double pepperoni;

    public void customizeOrder(String pizzasize,int cheztop,int peptop){
        size=pizzasize;
        cheesetopping=cheztop;
        pepperoni=peptop;

    }



    public double calcCost(  ){

        if (size.equalsIgnoreCase("small")){
            return 10+cheesetopping+(pepperoni*1.5); }
        else if (size.equalsIgnoreCase("medium")){
            return 12+cheesetopping+(pepperoni*1.5); }
        else {
            return 14+cheesetopping+(pepperoni*1.5); }

    }
    public String toString() {
        String result = "Size is: " + size + ", Cheese toppings are " + cheesetopping + ", Pepperoni toppings are: " + pepperoni +" and your total price is "+calcCost();

        return result;
    }








    public static void main(String[] args) {

    }
}
