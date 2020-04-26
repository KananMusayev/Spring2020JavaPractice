package Day16DoWhileLoops;

public class Warmup3 {
    public static void main(String[] args) {
        /*
        write a java program that can remove duplicated values
        from String
        Ex:
                input:aabbcc
                output:abc
         */

        String s1 = "aabbcc";
        String result ="";
        for (int i = 0;i<s1.length();i++){
            if (!result.contains(s1.substring(i,i+1))){
                result+=s1.substring(i,i+1);
            }
        }
        System.out.println(result);
    }
}
