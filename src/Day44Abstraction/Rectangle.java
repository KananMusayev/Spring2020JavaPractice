package Day44Abstraction;

public class Rectangle extends Shape{
    public double width;
    public double length;

    @Override
    public void Area(){
        double area=width*length;
        System.out.println("Area of Rectangle is : "+area);
    }
    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }
}
