package ClassTasks;

public class BankAccount {

    /*
    create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
     */

    public String bankName;
    public String firstName;
    public String lastName;

    private String accountHolder;
    private int accountNumber;
    private int balance;

    public BankAccount(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void availableBalance(){
        System.out.println("Your balance is "+balance);
    }
    public String toString(){
        return firstName+" "+lastName+" balance is: $"+balance;
    }

    public void withdrawing(int amount){
        balance-=amount;
    }
    public void depositing(int amount){
        balance+=amount;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
}
