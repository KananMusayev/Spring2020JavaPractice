package Day40Inheritance;
public class Protected_VS_Default {

    protected static String name;
     String ID;

    protected static void printHello(){
        System.out.println("Hello");
    }
    void printHola(){
        System.out.println("Hola");
    }



}

class classCybertek{
    public static void main(String[] args) {
        Protected_VS_Default obj1=new Protected_VS_Default();
        obj1.printHello();
        obj1.printHola();
        System.out.println(obj1.ID);
        System.out.println(obj1.name);
    }
}
