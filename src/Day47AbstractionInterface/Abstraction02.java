package Day47AbstractionInterface;

interface A1{

    void method1();

}



interface B1{
   abstract void method2();


}
interface C1{
    public abstract void method3();

}



public  class Abstraction02 implements A1,B1,C1{//we can implement as many interfaces to a class as we want

    @Override
    public void method1() {

    }


    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
