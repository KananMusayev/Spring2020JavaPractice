package Day50PolymophismRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {


        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);
        Cylinder cylinder1 = new Cylinder(3, 5);
        Cylinder cylinder2 = new Cylinder(3, 5);

        ArrayList<Shape> list = new ArrayList<>(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

        for (Shape each:list){
            System.out.println(each.name+":"+each.calculateArea());
        }

        System.out.println("===========================");

        double d=( (Cylinder)list.get(2)).calculateVolume();
        System.out.println(d);

        Shape s1=new Circle(6);
        //System.out.println(s1.radius);
        System.out.println(((Circle)s1).radius);




    }
}
