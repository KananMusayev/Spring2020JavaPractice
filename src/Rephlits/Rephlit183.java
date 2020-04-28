package Rephlits;
import java.util.ArrayList;

public class Rephlit183 {
    public static void main(String[] args) {

    }

    public static int sum(ArrayList<Integer> ints){


        int sum=0;
        for (int i=0;i<ints.size();i++){
            sum+=ints.get(i);
        }
        return sum;
    }

}
