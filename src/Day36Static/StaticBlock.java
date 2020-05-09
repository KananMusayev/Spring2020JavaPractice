package Day36Static;

public class StaticBlock {



    public static void main(String[] args) {

        System.out.println("method ");
        method1();
    }


    static {
        System.out.println("static block");
    }

    public static void method1(){
        System.out.println("custom method");
    }
}
