package InteviewquestionsPractice;

public class PrimeNumber {




    public static boolean primenum(int num){

        boolean result=false;
        if (num<=1){
            result=false;
        }
        for (int i=2;i<num;i++){
            if (num%i==0){
                result=true;
            }
        }
        return result;
    }

    public static void main(String[] args) {


        System.out.println(primenum(57));

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
