package Day33ClassAndObject;

public class Car {
    //lest assume below are the attributes of car  :
    String Model;
    int    Year;
    String Color;
    double Price;
    long   mileage;
    String Brand;

    public void drive (){
        //this is an instance method
        System.out.println("Driving "+Brand);
    }


    public void start(){
        System.out.println(Brand +" is starting");
    }

    public void getInfo(){
        System.out.println(Year+" "+Brand+" "+Model+", "+Color+", "+mileage+" miles, $"+ Price);

    }




    public static void main(String[] args) {





    }
}
