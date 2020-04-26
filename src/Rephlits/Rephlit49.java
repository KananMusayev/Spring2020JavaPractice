package Rephlits;

public class Rephlit49 {
    public static void main(String[] args) {

    }


    public static int countVowels (String s){
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.substring(i,i+1).equals("a")||s.substring(i,i+1).equals("e")||s.substring(i,i+1).equals("i")||s.substring(i,i+1).equals("o")||s.substring(i,i+1).equals("u")){
                count++;
            }
        }
        return count;
    }
}
