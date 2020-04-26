package Rephlits;

public class Rephlit195 {
    public static void main(String[] args) {
        String word1="listen";
        String word2="silent";
        int count=0;
        for (int k=0;k<word1.length();k++) {
            for (int i = 0; i < word1.length(); i++) {
                if (word1.substring(i,i+1).equals(word2.substring(k,k+1))){
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(isAnagram("listen", "Silent"));
    }

    public static boolean isAnagram(String word1, String word2) {
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        boolean result=false;
        int z=word1.length()+word2.length();
        int count=0;

        for (int k=0;k<word1.length();k++) {
            for (int i = 0; i < word1.length(); i++) {
                if (word1.substring(i,i+1).equals(word2.substring(k,k+1))){
                    count++;
                }
            }
        }
        if (word1.length()==word2.length()&&count==word1.length()){
            result=true;
        }
        return result;
    }

    }
