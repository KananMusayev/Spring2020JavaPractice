package Day35JavaRecap;

public class CellPhones {

    String brand;
    double screenSize;
    String color;
    double price;
    String model;

    public CellPhones (String brand,double screenSize,String color,double price,String model){

        this.brand=brand;
        this.screenSize=screenSize;
        this.color=color;
        this.price=price;
        this.model=model;
    }

    public void getInfo(){
        System.out.println(brand+" "+model+" "+color+" "+screenSize+" $"+price);
    }

    public  void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }

    public void sendmessage(long phoneNumber){
        System.out.println("Sending messages to "+phoneNumber);

    }
}
