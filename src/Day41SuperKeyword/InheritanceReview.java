package Day41SuperKeyword;

class Data{

    public static int num1=10;
    protected static int num2=20;
    private static int num3=30;//it is not visible for otside class bcs its private specifier
    static int num4=40;




}



public class InheritanceReview extends Data{
    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num4);


    }





}
