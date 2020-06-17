package Day48PolymorphismIntro;

import Day48PolymorphismIntro.Drinkable;

public class IceCoffee implements Drinkable {

    int size;

    public String toString(){
        return "Size of iceCoffee is: "+size;
    }


    @Override
    public void drink() {

    }

    @Override
    public void eat() {

    }
}
