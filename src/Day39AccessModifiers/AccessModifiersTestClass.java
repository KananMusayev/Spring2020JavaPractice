package Day39AccessModifiers;
import Day38OOPEncapsulation.TestData;

import static Day39AccessModifiers.AccessModifiers.*;
public class AccessModifiersTestClass {

    public static void main(String[] args) {


        System.out.println(age);
        //System.out.println(TestData.number);//gives error bcs we can not call protected access modifier
        // outside the package

        AccessModifiers obj1=new AccessModifiers();
        System.out.println(obj1.namePublic);
        //System.out.println(obj1.namePrivate);//it is private and its not visible outside the class

        System.out.println(obj1.nameDefault);


    }
}
