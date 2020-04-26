package Rephlits;

public class Rephlit168 {
    public static void main(String[] args) {
        System.out.println(coverString("hello hello", "ello"));

    }

    public static String coverString(String main, String coverME) {
        String a="["+coverME+"]";
        if (main.contains(coverME)){
            main=main.replace(coverME,a);
        }
        else if (!(main.contains(coverME))){
            main=main;
        }
        return main;
    }

    }
