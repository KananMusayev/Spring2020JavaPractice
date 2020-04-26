package Rephlits;

public class Rephlit50 {
    public static void main(String[] args) {
        System.out.println(keepVowels("how do i internets"));
    }

    public static String keepVowels(String s){
        String result="";
        for (int i=0;i<s.length();i++){
            if (s.substring(i,i+1).equals("a")||s.substring(i,i+1).equals("e")||s.substring(i,i+1).equals("i")||s.substring(i,i+1).equals("o")||s.substring(i,i+1).equals("u")){
                result+=s.substring(i,i+1);
            }
        }
        return result;
    }
}
