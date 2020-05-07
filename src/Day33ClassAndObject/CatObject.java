package Day33ClassAndObject;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObject {


    public static void main(String[] args) {

        Cat obj1=new Cat();
        obj1.catinfo("Balaca","white",2,"Mestan");
        Cat obj2=new Cat();
        obj2.catinfo("Orta","black",1,"Kedi");
        Cat obj3=new Cat();
        obj3.catinfo("Boyuk","brown",3,"Lucy");

        Cat [] array={obj1,obj2,obj3};
        for (Cat eachcat:array){
            System.out.println(eachcat);
        }

        //or
        System.out.println("=================");

        ArrayList<Cat> list=new ArrayList<>(Arrays.asList(obj1,obj2,obj3));
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("=================");

        for (Cat eachcat:list){
            System.out.println(eachcat);
        }
        System.out.println("=================");

        obj1.sleep();
        obj2.sleep();

        System.out.println("=================");

        obj1.eat("fish");
        obj2.eat("catfood");
        obj3.eat("shish kabab");
        System.out.println("=================");

        obj1.drink("water");
        obj2.drink("beer");
        obj3.drink("milk");




    }
}
