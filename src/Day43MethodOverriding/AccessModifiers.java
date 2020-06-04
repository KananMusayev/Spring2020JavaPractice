package Day43MethodOverriding;


class Mehriban{

     void methodA(){
        System.out.println("Method A");
    }

    public String method(){
         return "a";
    }

    protected double salary(double bonus){
         return bonus+10000;
    }
}


public class AccessModifiers extends Mehriban{

/*


    @Override
    private void methodA(){
        System.out.println("Method A");
    }

        Override method's access modifier has to be same level or mode visible than the method we are overriding
 */
@Override
public double salary(double a){
    return a;
}
        @Override
        protected void methodA(){
    System.out.println("Method A");
                                    }

    @Override
    public String method(){
        return "c";
    }


}
