package Day49PolymorphismContinue;

public class ReferenceTypeCasting {


    public static void main(String[] args) {
        int a=100;
        double b=a;//implicitly or automatically done. Smaller type can always be assigned to the larger type

        Dog dog=new Dog("a",'f',3);
        Animal animal=dog;//Upcasting and done implicitly
        Cat cat=new Cat("a",'f',3);
        //Dog dog1=(Dog)cat;//there is no relationship they are siblings

        System.out.println("=====================");

        double c=10;
        int k=(int)c;//explicit casting done manually as well



        Animal animal1=new Dog("r",'m',3);

        Dog dog2=(Dog) animal1;//downcasting done manually only
        Animal animal2=new Cat("f",'f',5);

        Cat cat1=(Cat)animal2;//downcasting

        System.out.println("=====================");

        Animal animal3=new Dog("f",'f',5);
        //animal3.bark();
        Dog dog1=(Dog)animal3;
        dog1.bark();
        //second way :
        ((Dog)animal3).bark();







    }
}
