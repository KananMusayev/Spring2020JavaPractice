package Day38OOPEncapsulation;

public class Test {





    public static void main(String[] args) {
        TestData obj=new TestData();
        System.out.println(obj.getName());//data was private thats why i couldnt get access to it

        System.out.println(obj.getID());
        int a=obj.getID();//u can assign it to another variable
        obj.setName("Kenan");
        System.out.println(obj.getName());
        obj.setID(400);
        System.out.println(obj.getID());



    }
}
