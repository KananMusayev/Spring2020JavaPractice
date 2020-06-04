package Day43MethodOverriding;




public class Bank {

public void InterestRate(){
    System.out.println("9 percent");
}

    public static void main(String[] args) {
        BankofAmerica BOA=new BankofAmerica();
        BOA.InterestRate();

        ChaseBank chaseBank=new ChaseBank();
        chaseBank.InterestRate();

        CapitolOne CO=new CapitolOne();
        CO.InterestRate();
    }

}


class BankofAmerica extends Bank{
        @Override
   public void InterestRate(){
        System.out.println("5 percent");
    }
    //@Override used for indentifiying if the method is overriden and since the method below is not overriden it gives error message

    public void print(){

    }



        }
class ChaseBank extends Bank{

    @Override
    public void InterestRate(){
        System.out.println("6 percent");
    }

}


class CapitolOne extends Bank{
    @Override
    public void InterestRate(){
        System.out.println("4 percent");
    }


}
