package Rephlits;

import java.util.Arrays;

public class Rephlit72 {
    public static void main(String[] args) {
        String first_names[] = {"bob","joe"};
        String last_names[] = {"jones","smith"};
        System.out.println(Arrays.toString(combineNames(first_names,last_names)));
    }


    public static String[] combineNames(String[] first_names, String[] last_names){
        String [] result=new String[first_names.length];
        for (int i=0;i<first_names.length;i++){
            result[i]=first_names[i]+" "+last_names[i];
        }
        return result;
    }

}
