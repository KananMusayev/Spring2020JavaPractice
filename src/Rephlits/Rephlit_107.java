package Rephlits;

import java.util.ArrayList;

public class Rephlit_107 {
     /*
        On the left, write code that will remove the first two
         elements in an ArrayList of doubles (be careful, this is a little tricky!)
         */

    public static void main(String[] args) {

    }
    public static void test(ArrayList<Double> dubs){
        double a=dubs.get(0);
        double b=dubs.get(1);
        dubs.remove(0);
        int c=dubs.indexOf(b);
        dubs.remove(c);
    }
}
