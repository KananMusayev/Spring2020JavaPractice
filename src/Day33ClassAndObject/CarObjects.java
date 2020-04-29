package Day33ClassAndObject;

public class CarObjects {

    public static void main(String[] args) {

        Car       car1=      new          Car();
//   className   objName     keyword     Constructor

        car1.Brand="BMW";
        car1.Color="Red";
        car1.mileage=13667;
        car1.Model="740 Li";
        car1.Year=2013;
        car1.Price=75000;
        System.out.println(car1.Brand);
        System.out.println(car1.Color);
        System.out.println(car1.mileage);
        System.out.println(car1.Model);
        System.out.println(car1.Year);
        System.out.println(car1.Price);


        System.out.println("=======================================");
        Car car2 = new Car();


        System.out.println(car2.Brand); //will give us null bcs it is not stored yet


        car2.Brand="Toyota";
        car2.Price=22000;
        car2.Year=2018;
        car2.Model="Corolla" ;
        car2.mileage=61400;
        car2.Color="Pearl white";


        System.out.println(car2.Brand);
        System.out.println(car2.Price);
        System.out.println(car2.Year);
        System.out.println(car2.Model);
        System.out.println(car2.mileage);
        System.out.println(car2.Color);

        car1.drive();
        car2.drive();
        car1.start();
        car2.start();
        car1.getInfo();
        car2.getInfo();


        Car car3=new Car();
        car3.getInfo();//will give u default values ==>0 null null, null, 0 miles, $0.0
        car3.Brand="Lexus";
        car3.Model="LX 570";
        car3.Year=2020;
        car3.mileage=2300;
        car3.Color="Purple";
        car3.Price=105000;
        car3.getInfo();






    }
}
