package Day36Static;

public class StaticPractice {

    static long num1;//(static variable)
    long num2;//instance variable -->belongs to the object
    public static void main(String[] args) {

        System.out.println(num1);
        System.out.println(StaticPractice.num1);
        StaticPractice obj2=new StaticPractice();
        obj2.method2();
        obj2.method1();
    StaticPractice.method1();//calling the class below
       // StaticPractice.method2();//static method only acceps static futures
        //thats why we are getting error
        //in order to call non static method inside the static u have to have object
        //in order to call
        StaticPractice obj1=new StaticPractice();
            obj1.method2();//as u see once u have the object u can call it
    }

    public static void method1(){
        System.out.println("A");
    }

    //method2 is an instance method
    public void method2(){//belongs to the object not to the class
        //bcs it is not static
        System.out.println("B");

    }
}
