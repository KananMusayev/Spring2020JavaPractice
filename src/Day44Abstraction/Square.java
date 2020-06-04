package Day44Abstraction;

public class Square extends Shape{

    public double side;

    public Square(double side){
        this.side=side;
    }

    @Override
    public void Area(){
        System.out.println("Area of Square is : "+(side*side));
    }


}
