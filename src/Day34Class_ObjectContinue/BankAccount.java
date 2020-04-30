package Day34Class_ObjectContinue;

public class BankAccount {



    String AccountHolder;
    long AccountNumber;
    double Balance;

    public BankAccount(){

    }


    public BankAccount(String AccountHolder,long AccountNumber){
        this.AccountHolder=AccountHolder;
        this.AccountNumber=AccountNumber;

    }

    public void Deposit(double amount){
        System.out.println("-----------------------------");
        String acct=""+AccountNumber;
        String AccountNumber="************"+acct.substring(12);
        System.out.println("Depositing "+amount+" to the account "+AccountNumber);
        Balance+=amount;
        System.out.println("New Balance: $"+Balance);

    }

    public void withdraw(double amount){
        System.out.println("-----------------------------");
        if (Balance<=0){
            System.out.println("Not enough funds in the Account");
            return;//exits the method withdraw()
        }
        String acct=""+AccountNumber;
        String AccountNumber="************"+acct.substring(12);
        System.out.println("Withdrawing $"+amount+" from the account "+AccountNumber);
        Balance-=amount;
        if (Balance<0){
            Balance-=35;
        }
        System.out.println("Available balance: $"+Balance);

        System.out.println("-----------------------------");

    }

    public void Showbalance(){
        System.out.println("-----------------------------");
        String acct=""+AccountNumber;
        String AccountNumber="************"+acct.substring(12);
        System.out.println("Account Holder: "+AccountHolder);
        System.out.println("Account number: "+AccountNumber);
        System.out.println("Available balance: $"+Balance);
    }

    public void Accountsetup(String AccountHolder, long AccountNumber){

        /*
        here if u try to give same name as the ones on the top :
        Ex:AccountHolder=AccountHolder(local variable from parameters)
        and AccountNumber=AccountNumber
        it will give error because u can not make names same
         the instance variable with the local variable names
         thats why u have to use "this." keyword

         However this() keyword is use to call constructor
         But this. keyword used to call instance variables

         */
        this.AccountHolder=AccountHolder;
        this.AccountNumber=AccountNumber;

    }

    public static void main(String[] args) {

    }
}
