package Rephlits;

import java.util.ArrayList;

public class Rephlit187 {
    public static void main(String[] args) {

    }

    public static ArrayList<String> combineAL(ArrayList<String > wordList1,ArrayList<String > wordList2){

        ArrayList<String> result=new ArrayList<>();
        for (int i=0;i<wordList1.size();i++){
            result.add(wordList1.get(i));
        }
        for (int i=0;i<wordList2.size();i++){
            result.add(wordList2.get(i));
        }
        return result;

    }
}
