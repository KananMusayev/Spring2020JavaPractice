package Day40Inheritance;

class Parenclass {
    private static String username ="a";//not inheritable due to private modifier
    protected static String password="12345";//its is inheritable due to having protected modifier
    public static int age =12;//its is inheritable due to having public modifier
    static double salary=100000;


}



public class InhetirancePractice extends Parenclass {
            //  sub                         super
    public static void main(String[] args) {
       // System.out.println(username);//private
        System.out.println(password);//its is inheritable due to having protected modifier
        System.out.println(age);//its is inheritable due to having public modifier
        System.out.println(salary);

    }

}
