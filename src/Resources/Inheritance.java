package Resources;
import Day40Inheritance.Inhetirance;
import Day42InheritanceRecap.Data;
public class Inheritance extends Data{

        public static void main(String[] args) {
            System.out.println(Inheritance.publicData);
            System.out.println(Inheritance.protectedData);
          //  System.out.println(Inheritance.defaultdata); not visible outside the package
            //  but by calling it with the name u can call it still. Here if you called it
            //  with Class name thats why it didnt compile

           // System.out.println(privateData); not visible outside the package



        }
}
