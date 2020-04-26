package Examples;



public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println(10>9);
        boolean resultA = 10>9;
        System.out.println(resultA);
        System.out.println(10>=9);
        boolean resultB = 10>=9;
        System.out.println(resultB);
        boolean resultC = 10<=9;
        System.out.println(resultC);
        boolean resultD = 1100<1200;
        System.out.println(resultD);
        boolean resultE = 1000<1000;
        System.out.println(resultE);
        boolean resultF = 1000<=1000;
        System.out.println(resultF);
        int A = 5 ;
        A*=5+5;
        System.out.println(A);
        boolean resultG = 19==19;
        System.out.println(resultG);
        boolean resultH = 20!=20;
        System.out.println(resultH);
        boolean J= true == !false ;
        System.out.println(J);
        boolean K = ! false ;
        System.out.println(K);

        boolean B = !true ;
        System.out.println(B );

        /* In java true == true, false == false
        !false == true, ! true == false so therefore !false != !true
         */

        System.out.println( !false != !true);
        boolean c = !false != !true ;
        System.out.println(c);

        boolean d = true ==!false ;
        System.out.println(d);
        boolean e = !(!true);
        System.out.println(e);
        boolean f= 10 > 9 == 9<10 ;
        System.out.println(f);








    }
}
