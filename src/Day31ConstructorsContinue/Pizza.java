package Day31ConstructorsContinue;

public class Pizza {

    String size;
    int cheesetopping;
    int pepperonitopping;


    public Pizza (String  size,int cheesetopping, int pepperonitopping){

        this.cheesetopping=cheesetopping;
        this.size=size;
        this.pepperonitopping=pepperonitopping;
    }


    public double calcCost(){
        double total=0;
        if (size.equals("small")){
            total+=10;
        }
        else if (size.equals("medium")){
            total+=12;
        }
        else if (size.equals("large")){
            total+=14;
        }
        total+=1.5*pepperonitopping+cheesetopping;
        return total;
    }

    public String toString(){
        return "Size is: "+size+
                " Cheese topping amount is: "+cheesetopping+
                " Pepperoni topping amount is: "+pepperonitopping;
    }
}
