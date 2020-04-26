package Rephlits;

public class Rephlit54 {
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there"));
    }

    public static String thirdLetter(String s){
            String result="";

            for (int i=0;i<s.length();i+=3){
                result+=s.substring(i,i+1);
            }
            return result;
    }
}
