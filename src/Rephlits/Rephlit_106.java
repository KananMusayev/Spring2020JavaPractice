package Rephlits;
import java.util.ArrayList;
public class Rephlit_106 {
    public static void main(String[] args) {


    }
    /*
    On the left, given an ArrayList of Integers called ints,
    find and return the sum of all the Integers in ints.
     */
    public static int test(ArrayList<Integer> ints)
    {
        int sum=0;
        for (int i=0;i<ints.size();i++){
            sum+=ints.get(i);
        }
        return sum;
    }
}
