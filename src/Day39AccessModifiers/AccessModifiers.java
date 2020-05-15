package Day39AccessModifiers;

public class AccessModifiers {

    private static String schoolname="Cybertek";//this is private access modifier example
    static int age=20;//this is default access modifier by default
    //default access modifier can only be used within the packege and with available classes of the packege
    public static String name="Kenan";//public access modifier
    protected double num=15;//protected access modifier example
    //protected is only visible to the classes in same package. not visible outside the package
    //however we can inherit outside the package

    String nameDefault;//default
    public String namePublic;//public
    private String namePrivate;//private
    protected String nameProtected;//protected


    public static void main(String[] args) {



    }
}
