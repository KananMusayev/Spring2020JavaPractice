package Rephlits;

import java.util.ArrayList;

public class ArraylistAppendSum {
    public static void main(String[] args) {


    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

        ArrayList<Integer> arraylist=new ArrayList<>();
        int sum=0;
        for (int i=0;i<list.size();i++){
            if (list.get(i)>0){
                arraylist.add(list.get(i));
                sum+=list.get(i);
            }
        }
        arraylist.add(sum);
        return arraylist;
    }
}
