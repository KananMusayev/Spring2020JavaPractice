package Rephlits;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    public Car(String make,String model,int numberOfDoors,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }
    public Car(String make,String model,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.topSpeed=topSpeed;
        this.price=price;
        this.numberOfDoors=4;
    }

    public Car(int numberOfDoors,int topSpeed,double price){
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
        this.make="unknown";
        this.model="unknown";
    }

    public Car(String make,String model,int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;

    }


}
