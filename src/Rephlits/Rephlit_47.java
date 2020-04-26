package Rephlits;

public class Rephlit_47 {
    public static void main(String[] args) {
        System.out.println(sumFivesRange(11,28));
    }

    public static int sumFivesRange(int a,int b){
        int sum=0;
        for (int i=a;i<=b;i++){
            if (i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
}
