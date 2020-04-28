package Day25ListWrapperclass;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmupevening3 {
    public static void main(String[] args) {


        /*
        write a program that can find the unique elements from an
        ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
         */

        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5));

        ArrayList<Integer> b=new ArrayList<>();

        for (int z=0;z<a.size();z++) {
            int count = 0;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i)==a.get(z)){
                    count++;
                }
            }
            if (count==1){
            b.add(a.get(z));}

        }
        System.out.println(b);
    }


}
