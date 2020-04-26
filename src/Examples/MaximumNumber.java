package Examples;

public class MaximumNumber {
    public static void main(String[] args) {
        /*
         write a java program that accepts three numbers and
         return the maximum number
                (assume that none of them are equal)
         */

        int a = 324;
        int b = 236;
        int c = 129;
        if (a>b&&a>c){
            System.out.println(a+" is the maximum number"); }
        if (b>a&&b>c){
            System.out.println(b+" is the maximum number"); }
        if (c>b&&a<c){
            System.out.println(c+" is the maximum number"); }

    }
}
