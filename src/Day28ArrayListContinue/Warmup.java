package Day28ArrayListContinue;

public class Warmup {
    public static void main(String[] args) {
        System.out.println(RemoveDups("abcabc"));

        System.out.println(count("Java is love,i love Java,Java is fun,hollyJavaJavaJava","Java"));

        System.out.println(frequency("aabcabcabc"));
    }

public static String RemoveDups(String a){
    //write a return method that can remove duplicates from string
    //exremovedups("abcabc")==>"abc"
        String result="";
        for (int i=0;i<a.length();i++){
            if (!(result.contains(a.substring(i,i+1)))){
                result+=a.substring(i,i+1);
            }
        }
        return result;
}

public static int count (String a,String b){
        //method that returns total number of apperances of b in a string a
    //ex:"abcaba"==>3
    int count =0;
    for (int i=0;i<a.length()-b.length()+1;i++){
        if (a.substring(i,i+b.length()).equals(b)){
            count++;
        }
    }
    return count;



}

public static String frequency (String a){
//"aabcabcabc"==>"a4b3c3"
   String c=RemoveDups(a);//==>abc

   String empty="";
   for (int i=0;i<c.length();i++){
       int count=count(a,""+c.charAt(i));
       empty+=""+c.charAt(i)+count;
   }
    return empty;

}



}
