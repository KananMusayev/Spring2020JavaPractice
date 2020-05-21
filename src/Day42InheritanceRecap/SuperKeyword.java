package Day42InheritanceRecap;


class A{
    int a =100;

    public A(double b){
        System.out.println(this.a);
    }
}



public class SuperKeyword extends A{


    public SuperKeyword() {



        super(2.6);//100
        int a=200;
        System.out.println(super.a);//100


    }


    public static void main(String[] args) {
        SuperKeyword obj1=new SuperKeyword();

        A obj2=new A(5.5);
    }
}
