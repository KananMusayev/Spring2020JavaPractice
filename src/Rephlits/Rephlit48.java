package Rephlits;

public class Rephlit48 {
    public static void main(String[] args) {
        System.out.println(countA("aaBBdf8k3AAadnklA"));
    }

    public static int countA(String s){
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.substring(i,i+1).contains("a")||s.substring(i,i+1).contains("A")){
                count++;
            }
        }
        return count;
    }
}
