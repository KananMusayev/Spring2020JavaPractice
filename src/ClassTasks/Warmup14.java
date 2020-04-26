package ClassTasks;

public class Warmup14 {
    public static void main(String[] args) {
        /*
        how many times the book appeared on a string
        do it with while loop
         */

        String given = "i have book,i like book, i love book,book is life";
        int length =given.length();
        int count =0;
        int i=0;
        while (given.contains("book")){
            count++;
            given= given.replaceFirst("book","");
            }
        System.out.println(count);





    }
}
