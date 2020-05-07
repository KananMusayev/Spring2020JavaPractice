package Day34Class_ObjectContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {


        Dog dog1=new Dog();
        dog1.setdoginfo("Avcarka",7.5,4,"white","Toplan");
        System.out.println(dog1);
        Dog dog2=new Dog();
        dog2.setdoginfo("Husky",10,6,"Black","Oscar");
        System.out.println(dog2);
        Dog dog3=new Dog();
        dog3.setdoginfo("German sheppard",9,5,"orange","Judy");
        System.out.println(dog3);
        Dog dog4=new Dog();
        dog4.setdoginfo("Bulldog",7,8,"Yellow","Cici");
        Dog dog5=new Dog();
        dog5.setdoginfo("Kangal",9,6,"Brown","Julia");
        ArrayList<Dog> puppies=new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1,dog2,dog3));
        puppies.addAll(Arrays.asList(dog4,dog5));
        System.out.println("=============");

        for (int i=0;i<puppies.size();i++){
            Dog eachdog=puppies.get(i);
            System.out.println(eachdog);
        }
        puppies.removeIf(p->p.age==6);
        System.out.println(puppies);
        String food1="bone";
        String food2="fish";
        String  place1="pillow";
        String outside1="outside";
        String bench1="bench";

        dog1.eat(food1);
        dog2.sit(outside1);
        System.out.println("=================");
        puppies.addAll(Arrays.asList(dog4,dog5));
        for (int i=0;i<puppies.size();i++){
            puppies.get(i).eat(food2);
        }
        System.out.println("=================");

        for (Dog each:puppies){
            each.run("in the yard"); }
        System.out.println("=================");

        for (Dog each :puppies){
            each.sleep(" the sofa");
        }

    }
}
