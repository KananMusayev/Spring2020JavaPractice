package Rephlits;

public class Rephlit55 {
    public static void main(String[] args) {
        System.out.println(censorLetter("computer science",'e'));
    }

    public static String censorLetter(String s,char ch){
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==ch){
                s=s.replaceFirst(s.substring(i,i+1),"*");
            }
        }
        return s;
    }
}
