package Day33ClassAndObject;

public class BankAccount {
    String accountHolder;
    String  accountNumber;
    int balance;


    public String toString (){
        String result=accountHolder+" "+accountNumber+" balance: $"+balance;
        return result;
    }

    public void checkingBalance(){
        System.out.println("Dear "+accountHolder+" Your current balance is : $"+balance);
    }

    public void deposit(int amount){

        System.out.println("Dear "+accountHolder+" ,you have depositted "+amount);
        balance+=amount;
    }

    public void withdraw(int amount){

        if (balance<0){
            System.out.println("You dont have enough funds in your account");
            return;
        }
        System.out.println("Dear "+accountHolder+" ,you have withdrawn "+amount +" from your account");

        balance-=amount;
        if (balance<0){
            balance-=35;
        }
        System.out.println("Your current balance is :$"+balance);



    }
/*
Assignment:
  create a custom class for BankAccount
  attributes/data that can have are:
          1. AccountHolder, 2. AccountNumber, 3. Balance
    Actions: showBalance, deposit, withdraw
    requiremnts:
      1. user should be able to deposit money into their account
      2. user should be able to withdraw money from their account
          2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
          2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
      3. user should be able to see their balance
 */


    public static void main(String[] args) {

    }
}
