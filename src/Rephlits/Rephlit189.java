package Rephlits;

public class Rephlit189 {
    public static void main(String[] args) {

    }
    public static boolean isError(String line){
        boolean result=false;

            if (line.substring(0,5).equals("error")){
                result=true; }
            return result;
    }

}
