package Day24Method_Overloading;

public class WarmupFrequencyeasierway {
    public static void main(String[] args) {
        String str="AABBBCDS";
        String result="";
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='A'){
                count++;
            }
        }
    }
}
