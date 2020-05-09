package Day36Static;

import Day34Class_ObjectContinue.Tester;

public class StaticBlock4 {

    static String name="Cybertek School";
    static Tester tester1=new Tester();
    int insTanceVariable;

    //tester1.setInfo("Muhtar",123,"SDET",120000)
    static {//designed for statics only
       // insTanceVariable=300; static only accepts static
        //only way to call it you have to create an object inside the method

       // StaticBlock4 obj1=new StaticBlock4();
        //obj1.insTanceVariable=300;//DONT USE STATIC BLOCK TO INITIALIZE THE INSTANCE VARIABLE
        tester1.settestersinfo("Muhtar",123,"SDET",120000);
        tester1.settestersinfo("Kenan",126,"SDET",140000);

        name="Cybertek School";
    }



    public static void main(String[] args) {
        System.out.println(name);
        name="Alisa";
        System.out.println(name);
        System.out.println(tester1);

        StaticBlock4 obj2=new StaticBlock4();
        System.out.println(obj2.insTanceVariable);//0

    }
}
