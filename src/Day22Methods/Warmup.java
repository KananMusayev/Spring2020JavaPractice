package Day22Methods;

public class Warmup {
    public static void main(String[] args) {
        System.out.println(removeDups("aaabbbccc"));
        System.out.println(frequency("AAABB", "A"));
        System.out.println(frequency("ABAB", "B"));

    }

    /*
    write a return method that accepts a String and removes duplicate values from the String
        Ex:
                RemoveDuplicate("aaabbbccc");  ==> "abc"

     */

    public static String removeDups(String a){
        String empty="";
        for (int i=0;i<a.length();i++){
            if (!(empty.contains(a.substring(i,i+1)))){
                empty+=a.substring(i,i+1);
            }
        }
        return empty;

    }

    /*
     write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
        Ex:
            Frequency("AAABB", "A");  ==> 3
            Frequency("ABAB", "B"); ==> 2

     */

    public static int frequency(String str1,String str2){
        int count=0;
        for (int i=0;i<str1.length()-str2.length()+1;i++){
            if (str1.substring(i,i+str2.length()).equals(str2)){
                count++;
            }
        }
        return count;
    }



}
