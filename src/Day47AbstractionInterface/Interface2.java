package Day47AbstractionInterface;

public interface Interface2 {

    //public void method1(){ }abstract methods can not have body
    //{} instance block we can not have in interface
    public static void method4(){ }//static method
     void method5();//abstract method
    public default void method6(){


    }


     int a = 0;

    public static void main(String[] args) {


        System.out.println(a);//by default static
        //a=200;//by default it is final thats why u can not re-assign
        System.out.println(Interface2.a);
        Interface2.method4();




    }


}
