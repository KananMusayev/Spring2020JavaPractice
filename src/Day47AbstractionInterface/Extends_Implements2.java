package Day47AbstractionInterface;

interface P{
    void method1();
}


interface Q{
    int method2();
}

abstract class R{
    abstract void method3();
}
public class Extends_Implements2 extends R implements Q,P{//extends keyword has to be first


    //Q obj=new Q(); bcs it s not concrete

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }


}
