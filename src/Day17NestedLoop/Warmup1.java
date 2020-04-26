package Day17NestedLoop;

public class Warmup1 {
    public static void main(String[] args) {
        int i=1;
        String str = "";
       while (i<=30){
           str+=i%3==0&&i%5==0?"FINRA ":
                   i%3==0?"FIN ":
                           i%5==0?"RA ":i+ " ";
                i++;}
        System.out.println(str);
           /*if (i%3==0&&i%5==0){
               str+="FINRA "; }
           else if (i%3==0){
               str+="FIN "; }
           else if (i%5==0){
               str+="RA "; }
           else {
               str+=i+ " "; }
           i++; }
        System.out.println(str);*/






    }
}
