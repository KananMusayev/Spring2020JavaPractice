package Rephlits;

public class Rephlit170 {

    public static void main(String[] args) {

        System.out.println(clean("one two three ","two"));
    }
    public static String clean (String text ,String badWord) {

        String result="";

        if (text.contains(badWord)){
            text=text.replaceAll(badWord,"");
        }
        return text;
    }

    }
