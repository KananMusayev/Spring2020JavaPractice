package Day28ArrayListContinue;

public class ConstrcustorPractice {
//default constructor
    public ConstrcustorPractice(){
        System.out.println("salam");
    }
    public static void method1(){
        ConstrcustorPractice obj4=new ConstrcustorPractice();

    }

    public static void main(String[] args) {
        method1();
        ConstrcustorPractice obj=new ConstrcustorPractice();
        //even if u dont have line 5 method line 9 is still gonna compile
        //because default(no-arg)constructor is given by default ,when
        // there is no other constructors
        //ConstrcustorPractice obj2=new ConstrcustorPractice("Hello");
        //the line 13 will give u compile error bcs we dont have that
        //constructor method that accepts string parameter


    }
}
