package Day37InstanceInitializerBlock;

public class StaticVSInstanceVSConstructor {
        String name="Ali";

    static {
        System.out.println("Static Block");//execution doesnt depend on object

    }

    {
        System.out.println("Instance Block");//execution depends on object

    }
    public StaticVSInstanceVSConstructor(){
        System.out.println("Constructor");//execution depends on object

    }







    public static void main(String[] args) {

        System.out.println("Main Method");
        StaticVSInstanceVSConstructor obj1=new StaticVSInstanceVSConstructor();
        StaticVSInstanceVSConstructor obj2=new StaticVSInstanceVSConstructor();


    }

}
