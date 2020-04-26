package Day21Methods;

public class Task6 {
    public static void main(String[] args) {
    Calculation(4,6,"-");
    }

    public static void Calculation(int a,int b, String c){
        /*
         write a method called Calculation, that can accepts
         3 parameters: 2 numbers and one operator, and prints
          out the calculation
		if operator is not between [-, +, *, /, %] output
		should be Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;
         */
        if (c =="*"){
            System.out.println(a*b);
        } else if (c == "+") {
            System.out.println(a+b);
        }
        else if (c=="-"){
            System.out.println(a-b);
        }
        else if (c=="/"){
            System.out.println(a/b);
        }



    }
}
