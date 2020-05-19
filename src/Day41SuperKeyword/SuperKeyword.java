package Day41SuperKeyword;


class A{
    String name="Madina";

    public void methodA(){

    }
    public A(int a){

    }
}

public class SuperKeyword extends A{

public SuperKeyword(int a){
    super(100);// super class contructor must be called in the sub class
}


    public void method(){
        super.name="Kenan";
        this.name="Ihsan";
        super.methodA();
        this.methodA();

    }
}
