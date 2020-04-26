package Day25ListWrapperclass;

public class Warmup {
    public static void main(String[] args) {
    String TRD=Removedups("aaaaabbbccc");
        System.out.println(TRD);
    }

    /*
    write a return method that accepts a String and removes duplicate
    values from the String
    Ex:Removeduplicate(aaaaabbbccc)==>"abc"
     */
    public static String Removedups(String b){
        String empty="";
    for (int i=0;i<b.length();i++){
        if (!empty.contains(b.substring(i,i+1))){
            empty+=b.substring(i,i+1); }
    }
    return empty;


}}
