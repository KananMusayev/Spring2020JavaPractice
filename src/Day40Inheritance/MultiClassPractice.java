package Day40Inheritance;
class Data{
    public String name;
    private String age;
    String ID;

    public void Hello(){//public access modifier
        System.out.println("Hello");
    }
    private void Hola(){//private access modifier
        System.out.println("Hola");
    }
    void Aloha(){//default Access modifier
        System.out.println("Aloha");
    }
}


public class MultiClassPractice {
    public static void main(String[] args) {
        Data obj1=new Data();
        obj1.name="Kenan";
        System.out.println(obj1.name);//public is visible everywhere
       // System.out.println(obj1.age);//private is only visible with in the class
        System.out.println(obj1.ID);//default access modifier is visible to all classes with in same package
        obj1.Hello();
        obj1.Aloha();
    }

}
