package Day36Static_KeyWord;

public class StaticKeyword {
    int a;//instance variable
    //in instance variable u can have multiple values for each object

    static   int b;//static variable
    //shared by the class and by the objects


    public static void main(String[] args) {

        StaticKeyword obj1=new StaticKeyword();
        obj1.a=100;
        StaticKeyword obj2=new StaticKeyword();
        obj2.a=200;
        System.out.println(obj1.a);
        /*eac object has its own
        copy of instance variables*/
        System.out.println(obj2.a);
        double num=100.5;
        obj1.b=900;
        System.out.println(StaticKeyword.b);//900
        System.out.println(obj1.b);//900
        System.out.println(obj2.b);//900
        System.out.println("=================================");
        StaticKeyword obj3=new StaticKeyword();
        obj3.a=100;
        System.out.println(obj3.a);//100
        StaticKeyword obj4=new StaticKeyword();
        System.out.println(obj4.a);
        obj3.b=400;
        System.out.println(obj3.b);
        System.out.println(obj4.b);


    }
    //Static means that we can access the members through the class name
    //Static members in java belongs to the class and also called class members
    /* what can be static in java:
        1.static variables(global)
        2.static methods
        3.static initializer block
        4.static inner class(nested class)
    Instance variables: created in the class and outside any method
                        belongs to the object :each object has its own
                        copy of instance variables

   Local variables: declared within the methods or blocks
   only accessible within the method or blocks

   static variables :created in the class and outside any method
   by giving static keyword
   why do we need it and whats the difference between instance and static variables
   when a variable is static its shared by class and all objects of the class
   and we can call it through the classname

   Static method : a method that we can call through the class name
   there is no object instances in static method

   static methods only accepts class members
   none static can only be called through the objects in the static method

   "eger main methoddan colde class a int num;(instance variable) yazsan main methodda yaxud bashqa
   hansisa methodda hec cur o num i cagira bilmersen object vermeden eger object
   versen he onda cagira bilersen objectden"
    Static method can be called from the class but instance method u have to call it
    through the object
   */

public static void printHello(){
    System.out.println("Hello");
}


}
