package Examples;

public class WithoutCurlyBrace {
    public static void main(String[] args) {
        if (true)
            System.out.println("Hello");
        //System.out.println(); will give you red line
        else
            System.out.println("I am Kenan");
    }
}
