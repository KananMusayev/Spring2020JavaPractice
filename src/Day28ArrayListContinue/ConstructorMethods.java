package Day28ArrayListContinue;

public class ConstructorMethods {
    public ConstructorMethods(){
        System.out.println("Default Constructor");
    }
    public static void main(String[] args) {
         /*
        constructor is a method as well however it is a very scepial method used for creating
        the object of the class
        every single class MUST have a constructor
        if we didnt give the constructor then the compiler will give the default constructor(no-arg)


        3 types of methods:
        1.void methods
        2.return methods
        3.constructor (special)


        constructor methods can be overloaded by giving different parameter

        methods:  access -modifier  specifier  return type methodname(paramether){
        }
        decleration of constructor:
        default constructor: constructor without argument:
                acces modifier className(){
                statements;}

        constructor with argument:
        access -modifier className(parameter){
                statements;}

         Constructor cannot have return type and specifier.
         Constructor's name Must be same with the class name
         */

        //Constructor obj=new Constructor();

        /*
        Constructor calls:
        only a constructor can call another constructor

        Constructors execution depends on the creation of the object

        creat an object from the class :
            className referenceName=new existingConstructorMethod
         */
        ConstructorMethods obj =new ConstructorMethods();

    }
}
