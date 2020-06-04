package Day44Abstraction;

public final class Circle extends Shape {


    public double radius;
    public final static double pi=3.14;


    @Override
    public void Area(){
        double area=radius*radius*pi;
        System.out.println("Area of Circle is : "+area);
    }

     public  Circle(double radius){
        this.radius=radius;
     }
}

class ShapeObjects{


    public static void main(String[] args) {

        Circle obj1=new Circle(3.5);
        obj1.Area();
        Square obj2=new Square(4);
        obj2.Area();
        Rectangle obj3=new Rectangle(2,3);
        obj3.Area();
    }
}
