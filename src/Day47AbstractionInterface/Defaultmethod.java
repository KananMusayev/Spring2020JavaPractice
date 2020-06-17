package Day47AbstractionInterface;



abstract class T{
    //public default void method2(){} are meant to be used in interface
}

public interface Defaultmethod {

    default void method(){
        System.out.println("Default method");
    }

    public static void main(String[] args) {
       // method();
    }
}
class N implements Defaultmethod{

    public static void main(String[] args) {
        N obj=new N();
        obj.method();
    }

}
