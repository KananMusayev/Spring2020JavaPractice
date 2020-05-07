package Day33ClassAndObject;

import java.util.Arrays;

public class MashinObject {

    public static void main(String[] args) {

        Mashin obj1=new Mashin();
        obj1.ili=2011;
        obj1.marka="Vaz";
        obj1.model="07";
        obj1.qiymet=4200;

        Mashin obj2=new Mashin();
        obj2.ili=2018;
        obj2.marka="Toyota";
        obj2.model="Corolla";
        obj2.qiymet=23000;

        Mashin obj3=new Mashin();
        obj3.ili=2013;
        obj3.marka="BMW";
        obj3.model="740 IL";
        obj3.qiymet=45000;

        Mashin obj4=new Mashin();
        obj4.ili=2016;
        obj4.marka="Chevrolet";
        obj4.model="Cruz";
        obj4.qiymet=19500;

        Mashin obj5=new Mashin();
        obj5.ili=2019;
        obj5.marka="Vaz";
        obj5.model="Niva";
        obj5.qiymet=11000;

        obj1.mashinmelumatlari();
        obj2.mashinmelumatlari();
        obj3.mashinmelumatlari();
        obj4.mashinmelumatlari();
        obj5.mashinmelumatlari();

        Mashin[] array={obj1,obj2,obj3,obj4,obj5};

        System.out.println("====================");
        for (int i=0;i<array.length;i++){
            array[i].mashinmelumatlari();
        }
    }
}
