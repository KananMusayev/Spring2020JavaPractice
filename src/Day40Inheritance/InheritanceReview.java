package Day40Inheritance;



class A{//A
    public static void methodA(){
        System.out.println("A");
    }

    public static void main(String[] args) {
        methodA();//since super class is only a giver thats why we only had A method in it . Nothing could be inherited
    }
}
class B extends A {//AB
    /*
     public static void methodA(){
        System.out.println("A");
    } it is inherited even we cant see it
     */
    public static void methodB(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        methodA();//as its mentioned on top it was inherited so thats why we were able to call it
    }
}
public class InheritanceReview extends A {//AC
    /*
     public static void methodA(){
        System.out.println("A");
    }it is inherited even we cant see it
     */
    public static void methodC(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        methodA();//as its mentioned on top it was inherited so thats why we were able to call it
    }

}
