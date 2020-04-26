package Rephlits;

public class Rephlit43 {
    public static void main(String[] args) {

    }

    public static String makeThreeSubstr(String word,int startIndex,int endIndex){
        String empty="";
        for (int i=0;i<3;i++){
            empty+=word.substring(startIndex,endIndex);
        }
        return empty;
    }
}
