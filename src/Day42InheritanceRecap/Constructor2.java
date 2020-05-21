package Day42InheritanceRecap;


class test{

    public test(int a){
        this(2.5);
        System.out.println("A");
    }
    public test (double a){
        System.out.println("C");
    }
}



public class Constructor2 extends test{

   public Constructor2(){
       super(15);// C  A  B
       System.out.println("B");
   }

    public static void main(String[] args) {
        test obj =new test(17);// C A
        Constructor2 obj2=new Constructor2();


    }



}
