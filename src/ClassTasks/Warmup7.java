package ClassTasks;

public class Warmup7 {
    public static void main(String[] args) {


    /*
    Aa Bb Cc Dd...
     */
    String b = "";
    String c = "";
    b=b.toUpperCase();
    c=c.toLowerCase();
   for (char a='A';a<='Z';a++){
       b+=a+" "; }
   for (char d='a';d<='z';d++){
       c+=d+" "; }

   String result ="";

      for (int i=0;i<=b.length()-1;i++){
          result+=b.charAt(i)+""+c.charAt(i)+"";
      }
        System.out.println(result);


}}
