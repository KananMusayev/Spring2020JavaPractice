package ClassTasks;

public class Warmup9 {
    public static void main(String[] args) {
        /*
         write a program that can remove
         duplicated characters from a string
         abcdabcd ==> abcd
         */

        String given = "abcdabcd";
        String result = "";
        for (int i=0;i<given.length();i++){

            if (!result.contains(given.substring(i,i+1))){

                result+=given.substring(i,i+1); } }

        System.out.println(result);


    }
}
