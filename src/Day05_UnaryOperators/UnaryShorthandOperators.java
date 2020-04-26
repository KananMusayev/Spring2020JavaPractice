package Day05_UnaryOperators;

public class UnaryShorthandOperators {
    public static void main(String[] args) {
        int a = 10;

        int b = ++a ;
        System.out.println(a);
        System.out.println(b);
        int c = 10;
        int d = c++;
        System.out.println(d);
        System.out.println(c);
        double t1 = 3.5;
        double t2 = t1--;
        System.out.println(t1);//2.5
        System.out.println(t2);//3.5
        int num = 35 ;
        System.out.println(num++);//35
        System.out.println(num--);//36
        int ab = 1;
        a=-a    ;
        System.out.println(5+7+"8");

        System.out.println(1+5+"8"+7+6);



    }
}
