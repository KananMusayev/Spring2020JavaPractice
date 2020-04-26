package Rephlits;

public class Rephlit79 {
    public static void main(String[] args) {
        /*
        In this exercise you get a string called txt .
output txt without its last letter.
for example:
txt = "foo"
output will be:
fo
         */
        String txt="abcds";
        String str = "";
        str=txt.substring(0,txt.length()-1);
        System.out.println(str);
    }
}
