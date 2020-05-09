package Day36Static;

public class Test {
    public static void main(String[] args) {


        System.out.println(StaticBlock2.tester1);
        System.out.println(StaticBlock3.name);//gonna give u null bcs it is in the
        // main method of the StaticBlock3 class and main method it not visible
        // outside of that class and thats why we have to use static block instead
        System.out.println(StaticBlock3.num);
    }
}
