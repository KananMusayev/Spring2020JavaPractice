package Day33ClassAndObject;

public class CapitolOne {
    public static void main(String[] args) {

    BankAccount kenan=new BankAccount();

    kenan.accountHolder="Kenan Musayev";
    kenan.accountNumber="************1364";
        System.out.println(kenan);

    kenan.checkingBalance();
    kenan.deposit(10500);
    kenan.withdraw(5500);
        System.out.println("====================");
    kenan.withdraw(5001);
    kenan.withdraw(350);
    kenan.checkingBalance();


    }
}
