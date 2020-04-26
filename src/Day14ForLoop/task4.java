package Day14ForLoop;

public class task4 {
    public static void main(String[] args) {
        /*reverse the string/*

         */
        String str = "Java";//"avaJ"
        String reverse=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println(reverse);


       String rev ="";
       for (int i = 3;i>=0;i--){
       rev += str.charAt(i); }

        System.out.println(rev);
        System.out.println(reverse);
}}
