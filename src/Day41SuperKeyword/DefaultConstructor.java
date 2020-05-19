package Day41SuperKeyword;

class B{

    public B(){
        System.out.println("I am a default constructor from super class");
    }

}



public class DefaultConstructor extends B{

public DefaultConstructor(){
    System.out.println("This is sub class constructor");
}





    public static void main(String[] args) {
        DefaultConstructor obj=new DefaultConstructor();
    }

}
