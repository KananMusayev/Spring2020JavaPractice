package InteviewquestionsPractice;

public class FindingUniques {
    public static void main(String[] args) {


        /*

Modules
String -- Find the unique
Write a return  method that can find the unique
characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
         */
        String given="AAABBBCCCDEF";
        String result="";
        for (int k=0;k<given.length();k++) {
            int count = 0;
            for (int i = 0; i < given.length(); i++) {

                if (given.substring(i,i+1).equals(given.substring(k,k+1))){
                    count++;
                }
            }
            if (count==1){
                result+=given.substring(k,k+1);
            }

        }
        System.out.println(result);

    }
}
