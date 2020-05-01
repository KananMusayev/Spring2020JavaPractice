package Rephlits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodswithArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> wordList = new ArrayList<Integer>();
        wordList.add(7);
        wordList.add(7);
        wordList.add(7);





        System.out.println(refuel_times(wordList,7));




    }

    public static void removeAll(ArrayList<String >wordList,String targetWord) {

        for (int i=0;i<wordList.size();i++){
            if (wordList.get(i).equals(targetWord)){
                wordList.removeAll(Arrays.asList(targetWord));
            }
        }
        System.out.println(wordList);
    }


    public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n){
        if (r.contains(n)){
            r.removeAll(Arrays.asList(n));
        }
        return r;
    }

    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
        int refueltimes = 0;
        int maxfuelatbeginning=max_fuel;

        for (int i=0;i<deliveries.size();i++){
            if (deliveries.get(i)>=max_fuel&&max_fuel==maxfuelatbeginning){
                refueltimes+=deliveries.get(i)/max_fuel; }
            else if (deliveries.get(i)<=max_fuel){ //times=3;maxfuel=2
                if (max_fuel==deliveries.get(i)){
                    max_fuel=maxfuelatbeginning;
                    continue; }
                refueltimes++;
                max_fuel=max_fuel-deliveries.get(i);
                if (max_fuel==0){
                    max_fuel=maxfuelatbeginning; }
            }

        }

        return refueltimes;


    }}



