package Rephlits;

public class Accumulator {

    int sum;
    public Accumulator(int sum){
        this.sum=sum;
    }

    public int getSum(){
        return sum;
    }
    public void add(int value){
        sum+=value;
    }

    public void remove(int value){
        sum-=value;
    }

    public String toString(){
        return "Sum is: "+sum;
    }
}
