package CodingBat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class dfd {
    public static void main(String[] args) {
        System.out.println(primeNumber(17));

    }

    public static boolean primeNumber(int num) {

        boolean result = true;

        for(int i = 2; i <num; i++) {

                if (num%i==0){
                    result=false;
                }

        }
        return result;







    }
}
