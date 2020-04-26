package Examples;

public class IfelseandElseif {
    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 26;
        int n3 = 94;
        if (n1==n2){
            System.out.println(n1+" is equal to "+n2); }
        else if (n1==n3){
            System.out.println(n1+" is equal to "+n3); }
        else if (n2==n3){
            System.out.println(n2+" is equal to "+n3); }
        else if (n1==n2 && n2==n3 && n1==n3){
            System.out.println("all of them are equal");}
        else {
            System.out.println("none of them are equal"); }



    }
}
