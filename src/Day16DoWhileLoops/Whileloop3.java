package Day16DoWhileLoops;

public class Whileloop3 {
    public static void main(String[] args) {
        /*
        write a java program that can count how many time the word
        "book" is appeared in a String
         */

        String sentence = "I like book, I have book, I need book";
        int b=0;
        int indexn = 0;
        while (sentence.contains("book")){
            b++;
        sentence=sentence.replaceFirst("book","");}
        System.out.println(b);
        System.out.println(sentence);

    }
}
