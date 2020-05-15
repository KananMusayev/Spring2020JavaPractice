package InteviewquestionsPractice;

public class PrimeNumber {
    public static void main(String[] args) {

        /*
        if a number is divided to anything than itself and one then it is a prime number
         */
        int num=57;
        boolean result=false;
        if (num<=1){
            return;
        }
        for (int i=2;i<num;i++){
            if (num%i==0){
                result=true;
            }
        }
        System.out.println(result);
    }
}
