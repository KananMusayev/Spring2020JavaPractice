package Rephlits;

public class Rephlit65 {
    public static void main(String[] args) {
        /*
        You have a word, do the following:
If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.
Otherwise print "invalid".
fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid                        aabbccg
whatsup ==> ats
$ ==> invalid
         */
        String word = "whatsup";
        int lenght = word.length();
        int a=lenght/2-1;
        int b = lenght/2+2;
        if (lenght>=5&&lenght%2!=0){
            System.out.println(word.substring(a,b)); }
        else {
            System.out.println("invalid");}
}}
