package Day50PolymophismRecap;

public final class Circle extends Shape implements PI{


    public Circle(double radius){
        this.radius=radius;
        name="Circle";
    }


    double radius;


    @Override
    public double calculateArea() {
       return Pi*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*Pi;
    }
}
