package Day43MethodOverriding;



class Credentials{


    private final String UserName="cybertek";
    private final String password="12345";

    public void setUserName(String UserName){
        //this.UserName=UserName; you can not reassign the value of final variable
    }

    public String getUserName(){
        return getUserName();
    }

    public final static void add(int a,int b){
        System.out.println(a+b);
    }

    public static double add(double x,double y){
        return x+y;
    }




}


class Holly{

    final public void printname(){
        System.out.println("Erhan");

    }


}



public class FinalKeyword extends Holly{



   /* @Override
     public void printname(){
        System.out.println("Holly");
    }
    Final methods can not be overriden
    */

    final int Age=20;

    public static void main(String[] args) {

         final String SSN="123456";
       // SSN="654321";  final variables are constant and cant be re-assigned

        final String dateofBirtj;


        System.out.println(SSN);

        FinalKeyword obj =new FinalKeyword();
        System.out.println(obj.Age);

    }
}
