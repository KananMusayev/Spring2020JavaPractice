package Day24Method_Overloading;

public class SystemExitMethod {
    public static void main(String[] args) {

        System.out.println(number());
        System.out.println("Done");

    }

    public static int number() {

        if (true){
            System.exit(0);//exits all the java execution
        }
        return 5;
    }


}
