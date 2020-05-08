package Day36Static;

public class Dog {

    String breed;
    static boolean isPet=true;


    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.breed="Husky";
        dog1.isPet=true;

        Dog dog2=new Dog();


        System.out.println(dog2.breed);//will give u null bcs it is not assigned yet
        System.out.println(dog1.breed);
        dog2.breed="Poddle";

        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet);//it will give u true bcs static variables has
        // only one for copy for all the objects
        //one copy is shared by all the objects



    }
}
