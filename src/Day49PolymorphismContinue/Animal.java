package Day49PolymorphismContinue;

public abstract class Animal {
    public int age;
    public char gender;

    public static void methodA(){
        System.out.println("Animal class");
    }


    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}





    final class  Cat extends Animal{
        public String catName;

    public String toString(){

        return catName+" "+gender+" "+age;
    }
    public Cat(String catName,char gender, int age){
        this.catName=catName;
        this.age=age;
        this.gender=gender;
    }

    public final void scratch(){}
    @Override
    public void eat(){
        System.out.println("Cat "+catName+" is eating ");
    }
    @Override
     public void sleep(){
        System.out.println("Cat "+catName+" is sleeping");
    }
 }






 final class Dog extends Animal{

    public String dogName;
    public String toString(){
        return  dogName+" "+gender+" "+age;
    }

    public static void methodA(int a){
        System.out.println("Dog class A");
    }
    public Dog (String dogName,char gender,int age){
        this.dogName=dogName;
        this.age=age;
        this.gender=gender;
    }
    @Override
    public void eat(){
        System.out.println("Dog "+dogName+" is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Dog "+dogName+" is sleeping");
    }

    public void bark(){
        System.out.println("Dog "+dogName+" is barking");
    }
 }


 class AnimalObject{

     public static void main(String[] args) {

         Dog obj=new Dog("Lucy",'m',3);
         System.out.println(obj.dogName);
         obj.bark();

         Animal obj1 = new Dog("Hav-hav", 'f', 5);
         //obj1.bark();bcs this method doesnt belong to Animal class it belongs to Dog class
         // System.out.println(obj1.dogName);bcs this variable doesnt belong to Animal class it belongs to Dog class
         obj1.eat();
         obj1.methodA();//it is not overriden in dogs class thats why it will print the method from animal class
        ;//Will call it from Reference type class bcs only time it calls from objects class is when method is overriden in the objects class
         //however now it is only overloaded not overriden
        Animal animal1=new Cat("Bull",'f',2);
        boolean isCat=animal1 instanceof Cat;
         System.out.println(isCat);
         Dog d1=new Dog("A",'f',6);
         //boolean r1=d1 instanceof Cat; will give u error bcs there is no relationship between Dog and Cat class. They are siblings only


         Animal animal=new Cat("df",'g',7);
         boolean q1=animal instanceof Animal;

         boolean v=d1 instanceof Animal;
     }





 }
