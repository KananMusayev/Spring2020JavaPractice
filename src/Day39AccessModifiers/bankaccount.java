package Day39AccessModifiers;

public class bankaccount {

    private String accountholder;
    private int accountnumber;
    private double availablebalance;
    //getter

    public String getAccountholder(){
        return accountholder;
    }
    public int getAccountnumber(){
        return accountnumber;
    }
    public double getAvailablebalance(){
        return availablebalance; }
    public void setAccountholder(String accountholder){
        this.accountholder=accountholder;
    }
    public void setAccountnumber(int accountnumber){
        this.accountnumber=accountnumber;
    }





    public void deposit(double amount){
        System.out.println("You have depositted $"+ amount+" into your account");
        availablebalance+=amount;
        System.out.println("Your new balance is $"+availablebalance);
    }

    public void withdraw(double amount){
        if (availablebalance<=0){
            System.out.println("You can not withdraw due to the minus balance");
            return;
        }
        if (availablebalance>0){
            availablebalance-=amount;
            if (availablebalance<0){
                availablebalance-=35;
            }
        }
        System.out.println("You have withdrawn $"+amount+" from your account");
        System.out.println("Your new balance is "+availablebalance);

    }


    public void getInfo(){
        System.out.println("Name : "+getAccountholder());
        System.out.println("Account Number: "+getAccountnumber());
        System.out.println("Available balance: "+getAvailablebalance());
    }
    public void ShowBalance(){
        System.out.println("Available balance : "+availablebalance);
    }












/*

    public void setDeposit(double availablebalance,double amount){
        this.availablebalance=availablebalance;
        System.out.println("You have depositted $"+ amount+" into your account");
        availablebalance+=amount;
        System.out.println("Your new balance is $"+availablebalance);
    }

    public void setwithdraw(double availablebalance,double amount){
        this.availablebalance=availablebalance;
        System.out.println("You have withdrawn $"+amount+" from your account");
        availablebalance-=amount;
        System.out.println("Your new balance is "+availablebalance);

    }
    public void getavailablebalance(){
        System.out.println("Your current balance is: $"+availablebalance);
    }
    public String getAccountholder(){
        return accountholder;
    }
    public String setAccountholder
 */

}

