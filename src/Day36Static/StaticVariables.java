package Day36Static;

public class StaticVariables {
    static String name;
    static double num;
    int num1;


    public static void method1(){
        System.out.println("Open the browser");
    }
    public static void main(String[] args) {
        StaticVariables.method1();//static method we can call it throudh the class name
        StaticVariables obj1=new StaticVariables();
        obj1.name="Alisa";
        StaticVariables obj2=new StaticVariables();
        obj2.name="Kenan";
        System.out.println(obj2.name);
        System.out.println("================================");
        StaticVariables object1=new StaticVariables();
        object1.num=6.8;
        System.out.println(object1.num);
        //or
        System.out.println(StaticVariables.num);
        StaticVariables object2=new StaticVariables();
        System.out.println(object2.num);
        StaticKeyword.printHello();//called it from different class






    }
}
