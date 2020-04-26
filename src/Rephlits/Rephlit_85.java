package Rephlits;

public class Rephlit_85 {
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long","i"};
        System.out.println(minVowels(arr));
    }


    public static boolean isVowel(char ch)
    { boolean a=false;
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        a=true;
    }
    return a;
    }

    public static int countVowels(String s)
    {
        int count=0;
        for (int i=0;i<s.length();i++){
            if (isVowel(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static String minVowels(String[] words){
        String a="";
        int z=100;
        for (int i=0;i<words.length;i++){
            if (countVowels(words[i])<z){
                z=countVowels(words[i]);
                a=words[i];
            }
            if (countVowels(words[i])==1){
                if (words[i].length()<=2){
                    a=words[i];
                }

            }
        }
        return a;
    }





}