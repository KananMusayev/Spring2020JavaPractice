package Day32JavaRecap;

import java.util.ArrayList;

public class warmup1 {
    public static void main(String[] args) {


        /*
        Write a return method that can remove duplicated objects from an Integer Arraylist
         */
        ArrayList<Integer> b=new ArrayList<>();
        b.add(5);
        b.add(5);
        b.add(4);
        b.add(3);
        b.add(4);
        b.add(7);
        b.add(5);

    }

    public static ArrayList<Integer> removedups(ArrayList<Integer> a){
        ArrayList<Integer> b=new ArrayList<>();
        for (int k=0;k<a.size();k++) {
            int count = 0;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) == a.get(k)){
                    count++;
                }
            }
            if (count==1){
                b.add(a.get(k));
            }
        }
        return b;
    }
    public static ArrayList<String > removedups2(ArrayList<String > a){
        ArrayList<String> b=new ArrayList<>();

        for (int i=0;i<a.size();i++){
            if (!b.get(i).contains(a.get(i))){
                b.add(a.get(i));
            }
        }


            return b;
    }



}
