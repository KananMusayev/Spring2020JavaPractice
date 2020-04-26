package Rephlits;

public class AssesmentTest2point4 {
    public static void main(String[] args) {

    }
    public static boolean appearsTwice(String target, String sentence) {
        boolean result=false;
        int count=0;
        int length=target.length();
        for (int i=0;i<sentence.length()-length+1;i++){
            if (sentence.substring(i,i+length).equals(target)){
                count++;
            }
        }
        if (count==2){
            result=true;
        }
        return result;
    }

    }
