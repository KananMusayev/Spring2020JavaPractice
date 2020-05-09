package Day36Static;

import Day34Class_ObjectContinue.Tester;

public class StaticBlock3 {

    static String name;
    static int num;
    static Tester tester1;

    public static void main(String[] args) {
        name="Kenan";
        num=200;
        System.out.println(name);
        System.out.println(num);
    }
    static {
        name="Muhtar";
        tester1=new Tester();
        tester1.settestersinfo("Jean",123,"SDET",24000);

    }
}
