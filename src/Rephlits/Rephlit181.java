package Rephlits;

import java.util.ArrayList;

public class Rephlit181 {
    public static void main(String[] args) {

    }

    public static String combineRs(String[] r1,String[] r2) {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < r1.length; i++) {
            a.add(r1[i]);
        }

        for (int i = 0; i < r2.length; i++) {
            a.add(r2[i]);
        }
        String empty="";

        for (int i=0;i<a.size();i++){
            empty+=a.get(i);
        }
        return empty;

    }

}
