package Day48PolymorphismIntro;

class Animal extends Robot{

}


class  Dog extends Animal{




}


class  Cat extends Animal{

}

class Robot{


}

class A{

}
class B extends A{

}

public class Polymorphism_Intro {

    public static void main(String[] args) {

     //   B obj=new A(); sub class can never be the reference for super class' object
        Animal obj=new Dog();
        Animal obj1=new Animal();
        Animal obj2=new Cat();

        //Dog obj3=new Cat();
        Dog obj4=new Dog();
        Cat obj5=new Cat();
        Animal [] animalshow={obj,obj2,obj4,obj5};
        Robot obj6=new Robot();
        Robot[] list={obj1,obj,obj2,obj4,obj5,obj6};


    }


}
