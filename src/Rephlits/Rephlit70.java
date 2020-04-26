package Rephlits;

public class Rephlit70 {
    public static void main(String[] args) {
        String a="Dear Alejandro please get the hell out of here";
        boolean b=a.contains("Alejandro")||a.contains("alejandro");
        boolean c = a.contains("project")||a.contains("Project");
        if (b&&c){
            System.out.println("read this mail"); }
        else {
            System.out.println("dont read"); }
    }
}
