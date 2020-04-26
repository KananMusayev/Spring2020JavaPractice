package Day05_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        // +, -, ++, --, !

    int a = 10 ;
    int b = +a;
        System.out.println(a);
        System.out.println(b);
    int c = -10;
    boolean result = c>0;
        System.out.println(result);
        boolean result2= c<0;
        System.out.println(result2);
        int x = -10;
        int y = -x;
        System.out.println(y);
        int x1 = 20;
        int y1 = -x1;
        System.out.println(y1);
        // ++ and -- they increase and decrease the value by 1 ;

        int A = 100;

        System.out.println(++A);
        System.out.println(A);
        int P = 100;
        System.out.println(P++);
        System.out.println(P);




    }
}
