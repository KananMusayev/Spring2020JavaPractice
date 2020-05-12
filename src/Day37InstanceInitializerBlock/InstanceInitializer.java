package Day37InstanceInitializerBlock;

public class InstanceInitializer {
        int a;
    {
        System.out.println("intance block 1");
    }

    {
        System.out.println("intance block 2");
    }
    {
        System.out.println("intance block 3");
    }
        static {
            System.out.println("static block");
        }
    public InstanceInitializer(){
        System.out.println("contructor" );
    }




    public static void main(String[] args) {

        InstanceInitializer obj1=new InstanceInitializer();
        InstanceInitializer obj2=new InstanceInitializer();
        InstanceInitializer obj3=new InstanceInitializer();

    }
}
