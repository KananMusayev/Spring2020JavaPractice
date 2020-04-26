package Day24Method_Overloading;

public class ReturnMethods {
    public static void main(String[] args) {
        name();//this is a string value
        System.out.println(name());
        String abc=name();
        System.out.println(abc);


        System.out.println(Hastpust());
    }


    public static void method1(){
        System.out.println("hello world");
    }

    //1.Return method doesnt have "void" as a return type
    //2.return method must return a value
    //3.the returning value must mtch with the given return type
    //4.the method body must be closed with return statement
    //once return statement executed it exits the method and whatever u wrote after that
    //will give u error
    public static String name(){
        return "Batch12";
    }


    public static boolean Hastpust(){
        return 8>9;
    }






}
