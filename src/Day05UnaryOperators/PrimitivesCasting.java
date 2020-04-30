package Day05UnaryOperators;

public class PrimitivesCasting {
    public static void main(String[] args) {


        int a = 100;
        byte b = (byte)a;

        double d1 = 10.5 ;
        long L1 = (int) d1;
        System.out.println(L1);
        float F1 = 60.5f;
        int I1 = (int) F1;
        System.out.println(I1);
        long largeNum = 9999999999L;

        int Intnum = (int) largeNum;
        System.out.println(Intnum); // gives different number bcs it is out of ints range

        char ch1 = 'a' ;
        short sh1 = (short) ch1;
        System.out.println(sh1);
        char ch2 = 23456;
        double dbl1 = ch2;
        System.out.println(dbl1);
        int z1 = 10;
        double t1b = z1; // 10.0
        // short y1 = z1;


        System.out.println(t1b);


    }
}
