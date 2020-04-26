package Day31ConstructorsContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {
    int a[]={1,2,3,4,5,6};
    double b[]={4.3,5.4,6.1,3.2};
        System.out.println(arraylist(a));
        System.out.println(arraylist(b));

    }

    public static ArrayList<Integer> arraylist (int []a){

        ArrayList<Integer> list=new ArrayList<>();
        for (Integer i=0;i<a.length;i++){
            list.add(a[i]);
        }

        //or
        /*for (int each:a){
            list.add(each);
        }

         */
        return list;

    }

    public static ArrayList<Double> arraylist(double[]a){
        ArrayList<Double> abc=new ArrayList<>();
        for (Double each:a){
            abc.add(each);
        }
        return abc;

    }
}
