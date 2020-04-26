package Rephlits;

public class Rephlit169 {
    public static void main(String[] args) {
        System.out.println(wordCount("bla"));
    }

    public static int wordCount(String words) {
        int count=0;
        int size=0;
        String a[]=words.split(" ");
        count=a.length;
        return count;
    }

}
