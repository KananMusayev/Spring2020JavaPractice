package Day37InstanceInitializerBlock;

public class InstanceBlockPractice {

    public String name="Shirin";

    public InstanceBlockPractice(){
        this(10);
        name="Dinara";
    }
    public InstanceBlockPractice(int a){
        name="Muhtar";
    }

    {
        name="Mihray";
    }

    {
        name="Hatice";
    }
    public static void main(String[] args) {

        InstanceBlockPractice obj1=new InstanceBlockPractice();
        obj1.name="Alisa";
        System.out.println(obj1.name);
        InstanceBlockPractice obj2=new InstanceBlockPractice();

        System.out.println(obj2.name);//esmira
    }


}
