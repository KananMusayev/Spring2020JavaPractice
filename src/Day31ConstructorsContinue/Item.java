package Day31ConstructorsContinue;

public class Item {

    String name;
    double unitPrice;
    int quantity;

    public Item(String name,double unitPrice,int quantity){

        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;

    }
    public double calcCost(){
        double totalcost=0;
        return totalcost=quantity*unitPrice;
    }

    public String toString(){
        return "Name of the item is: "+name+
                        " quantity is: "+quantity+
                            " total cost is: "+calcCost();
    }
}
