package Day31ConstructorsContinue;

public class ConstructorMethod {
/*

    Constructor:
    1.Every class MUST have constructor
    2.If we dont give the constructor, then compiler will give the default constructor
    3.execution depends on the creation of the object
    4.constructors name must be same with the class name
    5.constructor can be overloaded


    creating object from a class:
    Classname obj = new existing constructor(Classname)


    decleration of constructor :
            default (no -arg constructors):
                access - modifier className(){

                }

        there is no return-type
        there is no specifier
        constructor name must be same with the class name


   constructor call:
        1.only a constructor can call another constructor
        2.constructors can not be called by their name. we MUST use this() keyword to
        call the corrent class constructor
        3.Constructor call has to be the first statement in constructor
        4.one constructor can call ONLY one constructor
        5.constructor can not call itself
        6.constructor cannot contain itself




     */

    public  ConstructorMethod(int a){
        this(10.5);
        System.out.println("Constructor with the argument "+a);
    }
    public ConstructorMethod (double a){
        System.out.println("constructor with the argument "+a);
    }
    public ConstructorMethod(boolean a){
        //System.out.println("afadkfhdksf");
        //eger yuxaridakini yazsan ashagidaki constructor call error verecek
        //constructor call HAS to be the priority
        this(100);
        //this(10.5); one constructor can only call one constructor
        System.out.println("constructor with argument of :"+a);
    }
    public static void main(String[] args) {
        ConstructorMethod obj =new ConstructorMethod(9);
        ConstructorMethod obj2 =new ConstructorMethod(true);

        method1();
    }
    public static void method1 (){
        //ConstructorMethod();
    }


}

