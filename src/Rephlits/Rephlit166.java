package Rephlits;

public class Rephlit166 {
    public static void main(String[] args) {
        System.out.println(mergeStrings("wooden","spoon"));
    }

    public static String mergeStrings(String one, String two) {
        String result="";
        int a=0;
        if (one.length()>two.length()){
            a=one.length();
        }
        else if (one.length()<two.length()){
            a=two.length();
        }
        else if (one.length()==two.length()){
            a=one.length();
        }
        for (int i=0;i<a;i++){
            if (i>=one.length()&&i<two.length()){
                result+=two.charAt(i);}
            else if (i< one.length()&&i>=two.length()){
                result+=one.charAt(i);}
            else {
            result+=one.charAt(i)+""+two.charAt(i);}

        }
        return result;
    }

    }
