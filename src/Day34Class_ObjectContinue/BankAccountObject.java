package Day34Class_ObjectContinue;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount bankaccount =new BankAccount();

        bankaccount.Balance=0;
        bankaccount.AccountNumber=3364234397623345L;
        bankaccount.AccountHolder="Kenan Musayev";

        bankaccount.Showbalance();
        bankaccount.Deposit(4500);
        bankaccount.Deposit(4000);
        bankaccount.withdraw(3600);
        bankaccount.withdraw(6000);
        bankaccount.withdraw(30);

        BankAccount bankaccount2 =new BankAccount();
        bankaccount2.Accountsetup("Alisa",4564572054465467L);

        bankaccount2.Showbalance();
        bankaccount2.Deposit(6800);
        bankaccount2.withdraw(4798);

        BankAccount bankAccount3=new BankAccount("Esmira",5476587567665432L);
        bankAccount3.Showbalance();
        bankAccount3.Deposit(15000);
        bankAccount3.withdraw(16000);
        bankAccount3.withdraw(35);

    }

}
