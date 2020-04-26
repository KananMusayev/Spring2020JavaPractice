package Rephlits;

public class Rephlit158 {
    public static void main(String[] args) {
        /*
        isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true
         */
        boolean a=isEven(6);
        System.out.println(a);

    }

    public static boolean isEven (int n){
        boolean result=false;
        if (n%2==0){
            result=true;
        }
        else if (n%2!=0){
            result=false;
        }
        return result;
    }
}
