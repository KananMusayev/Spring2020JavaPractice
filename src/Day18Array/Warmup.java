package Day18Array;

public class Warmup {
    public static void main(String[] args) {
        /*
        Write a program that can find unique characters from a string
        Ex:
        input:AAABCDEEEFF
        output:BCD
         */

        String a="AAABCDEEEFF";
        String unique ="";
        for (int j=0;j<a.length();j++) {
            int count =0;
            for (int i = 0; i < a.length(); i++) {
                if (a.substring(i, i + 1).equalsIgnoreCase(""+a.charAt(j))) {
                    count += 1;
                }
            }
                    if (count==1){
                        unique+=""+a.charAt(j);
                    }
        }
        System.out.println(unique);
    }
}
