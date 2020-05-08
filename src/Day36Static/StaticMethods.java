package Day36Static;

public class StaticMethods {


    int a=100;//instance variable
    static int b=200;
    public static void main(String[] args) {
        //System.out.println(a);// Not compiling bcs there is no object instances in the method
        //reason is static only accepts static

        StaticMethods obj1=new StaticMethods();
        System.out.println(obj1.a);


        System.out.println(b);
        System.out.println(StaticMethods.b);
        System.out.println(obj1.b); //it compiles but they prefer to be called through the classname



    }

    public void method(){
        System.out.println(a);
        System.out.println(b); }



}
