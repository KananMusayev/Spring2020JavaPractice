package Day42InheritanceRecap;

public class Accessmodifiers {

    public static String publicVariable="public";
    protected static String protectedVariable="protected";
    static String defaultvariable="default";
    private static String privateVariable="private";



    public static void publicMethod(){

    }

    static void defaultMethod(){

    }

    protected static void protectedMethod(){

    }

    private static void privateMethod(){

    }


}


class TestData2 extends Accessmodifiers{

    public static void main(String[] args) {

        System.out.println(TestData2.publicVariable);
        System.out.println(TestData.protectedData);
        System.out.println(TestData2.defaultvariable);
        publicMethod();
        protectedMethod();
        defaultMethod();
    }


}
