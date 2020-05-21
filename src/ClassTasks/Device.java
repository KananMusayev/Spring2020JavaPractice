package ClassTasks;

public class Device {


    String brand;
    String model;
    double price;
    String country;
    public String toString(){
        return "Brand is : "+brand+" model is : "+model+" price is : "+price+" country is : "+country;
    }
}

class   Tv extends Device{

    public void watch(){
        System.out.println("i am wathing to my movies at "+brand +" Tv");
    }
}

class Phone extends Device{

    public void call(){
        System.out.println("I am calling u from "+brand+", "+ model);
    }

    public void text(){
        System.out.println("I am texting u from "+brand+", "+ model);
    }
}
