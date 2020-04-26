package Day24Method_Overloading;

public class SystemExitMethod2 {
    public static void main(String[] args) {
        method1();
        System.out.println("Done");
        System.out.println("Completed");
    }


    public static void method1(){
        System.out.println("Hello World");
        System.exit(0);
    }
}
