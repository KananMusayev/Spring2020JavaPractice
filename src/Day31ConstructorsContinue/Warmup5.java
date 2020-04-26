package Day31ConstructorsContinue;

import java.util.ArrayList;

public class Warmup5 {
    public static void main(String[] args) {
        /*
        write a return method that accepts an Integer
        arraylist and returns the second minimum number

        DONT USE SORT METHOD
         */
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        System.out.println(secondmin(a));


    }

    public static int secondmin (ArrayList<Integer>a){
        Integer firstmin=a.get(0).MAX_VALUE;
        for (int i=0;i<a.size();i++){
            if (a.get(i)<firstmin){
                firstmin=a.get(i);
            }
        }
            int t=a.indexOf(firstmin);

        a.remove(t);

        Integer secondmin=a.get(0).MAX_VALUE;
        for (int i=0;i<a.size();i++){
            if (a.get(i)<secondmin){
                secondmin=a.get(i);
            }
        }

        return secondmin;

    }



    }




