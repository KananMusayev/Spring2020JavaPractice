package Rephlits;

public class Rephlit_84 {
    public static void main(String[] args) {

    }

    public static String maxLength(String[] words){
        String result="";
        for (int i=0;i<words.length;i++){
            if (words[i].length()>result.length()){
                result=words[i];
            }
        }
        return result;
    }

}
