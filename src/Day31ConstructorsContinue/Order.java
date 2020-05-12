package Day31ConstructorsContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    public static void main(String[] args) {

        Pizza pizza1=new Pizza("small",4,6);
        Pizza pizza2=new Pizza("medium",3,5);
        Pizza pizza3=new Pizza("large",2,5);
        Pizza pizza4=new Pizza("small",1,7);
        Pizza pizza5=new Pizza("large",4,7);
        ArrayList<Pizza> list=new ArrayList<>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).calcCost());
        }



    }
}
