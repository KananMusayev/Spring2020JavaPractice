package Day36Static;

import Day34Class_ObjectContinue.Tester;

public class StaticBlock2 {

    static int a;
    static int b;
    int c;

    /*
    if (100>200){
            a=100;
        }
        else {
            b=200;
        }
     */

   static Tester tester1=new Tester();

    public static void main(String[] args) {
        tester1.settestersinfo("Jean",123,"SDET",120000);

        System.out.println(tester1);
    }

    static {
        a=200;
        b=300;
        //c=100; static only accepts static not instance
        if (100>200){
            a=100;
        }
        else {
            b=200;
        }
        tester1.settestersinfo("Jean",123,"SDET",120000);

    }



}
