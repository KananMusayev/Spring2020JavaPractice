package Day34Class_ObjectContinue;

public class PizzaObject {

    public static void main(String[] args) {
        Pizza pizza1=new Pizza();
        pizza1.customizeOrder("medium",4,5);
        pizza1.customizeOrder("small",1,2);
        System.out.println(pizza1);
    }
}
