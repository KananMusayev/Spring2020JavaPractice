package Day07If_Statements_Review;

public class WarmupTask {
    public static void main(String[] args) {
        int year = 2000;
        if (year%4==0){
            System.out.println(year+" is Leap Year"); }
        else if (year%4==0||year>0){
            System.out.println(year+" is Not a Leap Year"); }
        else {
            System.out.println("Invalid request"); }
    }
}
