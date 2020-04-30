package Day06If_Statements;

public class Task03 {

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 2;
        int n3 = 3;
        int maximum = 0;
        if (n1 > n2 && n1 > n3) {
            maximum = n1;
        }
        if (n2 > n3 && n2 > n1) {
            maximum = n2;
        }
        if (n3 > n1 && n3 > n2) {
            maximum = n3;
        }
        System.out.println("Maximumm numbers between " + n1 + "," + n2 + "," + n3 + " is: " + maximum);

        //maximum numbers between num1,num2,num3 is

        int b ;//if you write false it is not gonna take
        if(true){
        b=10;}
        System.out.println(b);

    }}