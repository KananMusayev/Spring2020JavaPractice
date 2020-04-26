package Rephlits;

public class Rephlit44 {
    public static void main(String[] args) {
        System.out.println(mixString("12345","abcde"));
    }

    public static String mixString(String s1,String s2){
        String empty="";
        int a=s1.length()+s2.length();
        for (int i=0;i<s1.length();i++){
            empty+=s1.substring(i,i+1)+s2.substring(i,i+1)+"";
        }
        return empty;

    }
}
