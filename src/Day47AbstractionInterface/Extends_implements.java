package Day47AbstractionInterface;

interface I1{
    void method1();
}



interface I2 extends I1{
    void method2();

}



abstract class AC implements I2{
    abstract void method3();
}



public abstract class Extends_implements extends AC{

    @Override
    public void method2() {

    }
    //2 abstract methods left: method1 & method3

}


class testRun extends Extends_implements{

    @Override
    public void method1() {

    }

    @Override
    void method3() {

    }
}