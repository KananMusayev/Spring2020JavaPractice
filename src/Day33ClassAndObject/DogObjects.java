package Day33ClassAndObject;

public class DogObjects {
    public static void main(String[] args) {


        Dog dog1=new Dog();
        System.out.println(dog1.name);//gonna give u null because hasnt been initialized
        dog1.gender='F';
        dog1.breed="Husky";
        dog1.size="Small";
        dog1.color="gray and white";
        dog1.name="Holly";
        dog1.age=5;
        dog1.food="dog food";
        dog1.toy="bone";
        System.out.println(dog1.name);
        dog1.getInfo();

        Dog dog2=new Dog();
        dog2.breed="Pitbull";
        dog2.name="Lyka";
        dog2.color="Gray";
        dog2.age=3;
        dog2.size="Large";
        dog2.gender='M';
        dog2.food="meat";
        dog2.toy="bone";

        dog2.getInfo();

        dog2.eat();
        dog1.eat();
        dog1.play();
        dog2.play();

        String str =new String("Hello");
    }
}
