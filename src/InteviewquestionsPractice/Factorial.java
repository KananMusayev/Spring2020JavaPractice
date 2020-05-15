package InteviewquestionsPractice;

public class Factorial {
    public static void main(String[] args) {
        /*
        Numbers -- Factorial Number
Write a return method that returns the factorial
number of any given number

Ex:

Input: 5

outPut: 120
         */
        //5*4*3*2*1;

        int k=5;
        int factorial=1;
        for (int i=1;i<=5;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
