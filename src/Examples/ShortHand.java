package Examples;

public class ShortHand {
    public static void main(String[] args) {
        int a = 100;
        a*=100; //10000
        System.out.println(a);
        int b = 100;
        b*=100/10;// 1000
        System.out.println(b);//1000
        b *=b-1000; //

        int c = 1000;
        c/= 5; // 200
        System.out.println(c);
        int d=10;
       // c/=d-20; //
        System.out.println(c);
        c/=d+10;
        System.out.println(c);
        int z =10%3;
        System.out.println(z);
        int e = 10;
        e%=2;
        System.out.println(e);
        int f = 100;
        f%=2;
        System.out.println(f);


        System.out.println(10.5%3);
        int j = 300 ;
        int k = 10;
        j+=j%=k;
        System.out.println(j);










    }


}
