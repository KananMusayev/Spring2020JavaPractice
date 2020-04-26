package Rephlits;

public class Rephlit194 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Nurses Run"));
    }

    public static boolean isPalindrome(String check) {
        check=check.replaceAll(" ","");
        check=check.toLowerCase();
        boolean result=false;
        String empty="";
        int a=check.length();
        int k=0;
        for (int i=a-1;i>=0;i--){
            empty+=""+check.charAt(i);
        }
        if (empty.equals(check)){
            result=true;
        }
        return result;
    }

    }
