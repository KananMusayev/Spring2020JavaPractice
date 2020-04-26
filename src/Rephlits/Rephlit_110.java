package Rephlits;

import java.util.ArrayList;

public class Rephlit_110 {
    public static void main(String[] args) {
        ArrayList<String > wordList=new ArrayList<>();
        ArrayList<String > targetWord=new ArrayList<>();
        wordList.add("Alisa");       targetWord.add("Kenan");
        wordList.add("Esmira");      targetWord.add("Mehman");
        wordList.add("Kenan");       targetWord.add("Senan");
        wordList.add("Senan");       targetWord.add("Bebesh");
        for (int k=0;k<wordList.size();k++) {
            for (int i = 0; i < wordList.size(); i++) {
                if (wordList.get(i) ==targetWord.get(k)){
                    wordList.remove(targetWord.get(k));
                }

            }
        }
        System.out.println(wordList);

    }

    public static void removeAll(ArrayList<String > wordList,ArrayList<String > targetWord){


    }
}
