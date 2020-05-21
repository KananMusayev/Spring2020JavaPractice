package Day42InheritanceRecap;

class Test{

    public Test(){
        System.out.println("Super class default constructor");
    }
}



public class Constructor extends Test{
/*

    public Test(){
        System.out.println("Super class default constructor");
    }
 */
    public Constructor(){
        System.out.println("Sub class's constructor");
    }

    public static void main(String[] args) {
        //Constructor obj =new Constructor(); Super classe's contructor is default and object gonna call
        //super classes constructor by default first and then it will execute the sub class constructor
            Test obj=new Test();//this is parent classes constructor and its only gonna call super class

    }

}
