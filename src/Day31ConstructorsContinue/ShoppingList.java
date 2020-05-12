package Day31ConstructorsContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {


        Item item1=new Item("Apple",3.5,6);
        Item item2=new Item("Grape",2.4,5);
        Item item3=new Item("Lemon",1.5,5);
        Item item4=new Item("Potato",5.6,7);
        Item item5=new Item("Watermelon",3,2);

        ArrayList<Item> items=new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));
        double totalcost=0;
        for (int i=0;i<items.size();i++){
            totalcost+=items.get(i).calcCost();
        }
        System.out.println(totalcost);
    }
}
