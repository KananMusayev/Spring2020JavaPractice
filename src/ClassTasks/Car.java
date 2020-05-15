package ClassTasks;

public class Car {

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand){
        this.brand=brand;
    }
    public Car(String brand,String model){

        this.brand=brand;
        this.model=model;

    }
    public Car(String brand,String model,int year){

        this.brand=brand;
        this.model=model;
        this.year=year;

    }
    public Car(String brand,String model,int year,double price){

        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;

    }

    public String toString(){
        return "Brand is : "+brand+
                    " Model is: "+model+
                        " Year is: "+year+
                            " price is: $"+price;
    }

}
class Carobject{

    public static void main(String[] args) {
        Car car1=new Car("Toyota");
        Car car2=new Car("Lexus","GS 350");
        Car car3=new Car("Mercedes","G-63",2020);
        Car car4=new Car("BMW","760 Il",2020,98000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);


    }
}
