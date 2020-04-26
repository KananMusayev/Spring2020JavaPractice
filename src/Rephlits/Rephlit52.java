package Rephlits;

public class Rephlit52 {
    public static void main(String[] args) {
        System.out.println(alphabetical("abczef"));
    }

    public static String alphabetical(String str){
        String result="";
        System.out.println('a');
        for (char i='a';i<str.length();i++){
            if (str.charAt(i)>str.charAt(i+1)){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
