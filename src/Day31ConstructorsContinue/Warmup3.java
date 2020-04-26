package Day31ConstructorsContinue;

import java.util.ArrayList;

public class Warmup3 {
    public static void main(String[] args) {
        /*
        write a return method tht accepts an Integer arraylist
        and returns the second max number
        DONT USE SORT METHOD
         */

        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        System.out.println(secondmax(a));

    }

    public static int secondmax(ArrayList<Integer> a){
       Integer max= a.get(0);
       for (int i=0;i<a.size();i++){
           if (a.get(i)>max){
               max=a.get(i);
           }
       }
       Integer secondmax=a.get(0);
       for (int i=0;i<a.size();i++){
           if (a.get(i)>secondmax&&a.get(i)<max){
               secondmax=a.get(i);
           }
       }
       return secondmax;


    }


}
