package Rephlits;

public class Rephlit46 {
    public static void main(String[] args) {

    }

    public static int sumEvenToX(int x){
        int sum=0;
        for (int i=1;i<=x;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}
