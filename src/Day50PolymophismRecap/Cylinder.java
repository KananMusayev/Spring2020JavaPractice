package Day50PolymophismRecap;

public final class Cylinder extends Shape implements Volume,PI{

    double radius;

    double height;




    public Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;
        name="Cylinder";
    }




    @Override
    public double calculateArea() {
        return (Pi*2*radius*radius)+(height*Pi*2*radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2*(Pi*2*radius+height);
    }

    @Override
    public double calculateVolume() {
       return Pi*radius*radius*height;
    }
}
