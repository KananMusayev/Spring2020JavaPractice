package Day31ConstructorsContinue;

public class Circle {


    double radius;
    double pi=3.14;
    double diameter;


    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        double areaofcircle=pi*radius*radius;
        return areaofcircle;
    }
    public double perimeter(){
        double perimeter=2*pi*radius;
        return perimeter;
    }
    public String toString(){
        return "Radius is: "+radius+" Diameter is: "+diameter+" Area of circle is: "+area()+" Perimeter of circle is: "+perimeter();
    }
}
