package InteviewquestionsPractice;

public class DivideNumbersWithoutOperator {
    public static void main(String[] args) {
        /*
        Numbers -- Divide without / operator
Write a method that can divide two numbers without
 using division operator
         */
      int a=100;
      int b=10;
      int count=0;
      while (a>=b){
          a-=b;
          count++;
      }
        System.out.println(count);


    }
}
