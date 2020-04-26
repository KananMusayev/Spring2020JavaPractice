package Rephlits;

public class Rephlit173 {
    public static void main(String[] args) {

    }

    public static String biggerS(String a ,String b){
        String result="";
        if (a.length()>b.length()){
            result=a;
        }
        else if (a.length()<b.length()){
            result=b;
        }
        return result;
    }

}
