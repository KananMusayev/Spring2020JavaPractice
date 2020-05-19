package Rephlits;

public class GasTank {


    double amount=0,capacity;

    public GasTank(double capacity){
        this.capacity=capacity;
    }

    public void addGas(double value){
        amount+=value;
        if (amount>capacity){
            amount=capacity;
        }
    }
    public void useGas(double gonegas){
        amount-=gonegas;
        if (amount<0){
            amount=0;
        }
    }



    public boolean isEmpty(){
        boolean result=false;
        if (amount<0.1){
            result=true;
        }
        return result;
    }

    public boolean isFull(){
        boolean result=false;
        if (amount>capacity-0.1){
            result=true;
        }
        return result;
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        return capacity-amount;
    }
}
