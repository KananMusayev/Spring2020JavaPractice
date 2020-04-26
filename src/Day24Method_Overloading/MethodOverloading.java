package Day24Method_Overloading;

import java.sql.PreparedStatement;

public class MethodOverloading {
    /*
    it is a feature that allows us to have more than one method with same name,
    the methods must have different parameters
    return type of the method dont need to be same
    all the methods in java can be overloaded

    why we need it ?
    1.gonna make the code more reusable.improves the reusability
    2.also improves the readability
    3.easier to remember : u only need to remember one method name
    instead of remembering bunch of
    4.overload method is very flexible


     */

    //same method name ,different parameters
    public static void main(String[] args) {

        int result =sum(4, 6);
        System.out.println(result);
        System.out.println(sum(4,6,7));

        System.out.println(sum(5.8,9.7));
    }




    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,long b, int c){
        return a+(int)b+c;
    }
    //public static double sum(int a,int b){//parameters must be different
    //    return a+b;

    public static double sum(double a,double b){
        return a+b;
    }


}
