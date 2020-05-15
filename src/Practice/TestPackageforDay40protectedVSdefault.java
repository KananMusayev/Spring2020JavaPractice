package Practice;
import Day40Inheritance.Protected_VS_Default;
public class TestPackageforDay40protectedVSdefault extends Protected_VS_Default{
    public static void main(String[] args) {
        //below examples were given when we havent inherited the class and that why we were getting errors and had to comment out
        //Protected_VS_Default obj1 = new Protected_VS_Default();
        //obj.printHello();//bcs protected modifier is not visible outside the package
        //hoever u can inherit it;
        //obj1.printHola();//default modifier is not visible outside the package
        //obj1.name;//bcs protected modifier is not visible outside the package
        //obj1.ID;//default modifier is not visible outside the package

        //TestPackageforDay40protectedVSdefault obj=new TestPackageforDay40protectedVSdefault();
        //System.out.println(obj.name);
        //obj.printHello();
        //or what you can do if u dnt want to create an object u can make variables static
        System.out.println(name);
        printHello();
    }
}
