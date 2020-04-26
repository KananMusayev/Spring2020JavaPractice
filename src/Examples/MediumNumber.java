package Examples;

public class MediumNumber {
    public static void main(String[] args) {
        int a=24;
        int b = 89;
        int c = 76;
        if (a>b&&a<c){
            System.out.println(a+" is a medium number"); }
        else if (b>a&&c>b){
            System.out.println(b +" is a medium number"); }
        else if (c>a&&b>c){
            System.out.println(c +" is a medium number");}
    }
}
