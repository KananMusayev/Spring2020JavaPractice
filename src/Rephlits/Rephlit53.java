package Rephlits;

public class Rephlit53 {
    public static void main(String[] args) {
        System.out.println(spaceOut("hello"));
    }

    public static String spaceOut(String s){
        String result="";

        for (int i=0;i<s.length();i++){
            result+=s.substring(i,i+1)+" ";
        }
        return result;
    }

}
