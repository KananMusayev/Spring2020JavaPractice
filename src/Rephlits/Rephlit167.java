package Rephlits;

public class Rephlit167 {
    public static void main(String[] args) {
        System.out.println(uniqueChars("java"));
    }

    public static String uniqueChars(String str) {
        String result="";
        for (int k=0;k<str.length();k++) {
            if (!(result.contains(str.charAt(k)+""))){
                result+=str.charAt(k)+""; }}
        return result;}
}
