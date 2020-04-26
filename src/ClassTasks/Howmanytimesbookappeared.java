package ClassTasks;

public class Howmanytimesbookappeared {
    public static void main(String[] args) {
         /*
        how many times the book appeared on a string
         */
        String given = "i have book,i like book, i love book,book is life";
        int count=0;
        for (int i=0;i<given.length()-3;i++){
            if (given.substring(i,i+4).equalsIgnoreCase("book")){
                count++;
            }
        }
        System.out.println(count);


    }
}
