package Day42InheritanceRecap;


public class Data {

    public static String publicData="public";
    protected static String protectedData="protected";
    static String defaultData="default";
    private static String privateDate="private";

}

class testing extends Data{
    /*
    public
    default
    protected
     */


    public static void main(String[] args) {

        System.out.println(testing.defaultData);
        System.out.println(testing.protectedData);
        System.out.println(testing.publicData);



    }
}


class TestData extends Data{

    /*
    public static String publicData="public";
    protected static String protectedData="protected";
    static String defaultData="default";
    private static String privateDate="private";

     */
    public static void main(String[] args) {
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(publicData);
        //System.out.println(privateData); private access modifier is not inheritable

    }

}



