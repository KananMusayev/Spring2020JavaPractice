package Day46AbstractContinue;



class Test1{

public Test1(){ }//constructor
public void method1(){ }//instance method
public static void method2(){}//static method
//public abstract void method3(){} CAN NOT HAVE ABSTRACT METHOD IN REGULAR CLASS
 int a=300;//instance variable
static int b=200;//static variable

    {//instance block

    }
    static {//static block

    }



}

abstract class Test2{//abstract class

    public Test2(){ }
    public void method1(){ }//instance method
    public static void method2(){}//static method
    public abstract void method3();//ABSTRACT METHOD
    int a=300;//instance variable
    static int b=200;//static variable

    {//instance block

    }
    static {//static block

    }

}




public class Abstract_VS_NonAbstract {

}
