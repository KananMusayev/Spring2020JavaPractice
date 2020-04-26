package Day08_IfStatements_review;

public class Task2 {
    public static void main(String[] args) {
        int grade = 101;
        boolean A = grade >= 90 && grade <= 100;
        boolean B = grade >= 80 && grade < 89;
        boolean C = grade >= 70 && grade < 79;
        boolean D = grade >= 60 && grade < 69;
        boolean E = grade >= 0 && grade <= 59;
        boolean ValidGrade = grade>=0&&grade<=100;
        if (ValidGrade){
        if (A){
            System.out.println("You got A" ); }
        else if (B){
            System.out.println("You got B"); }
        else if(C){
            System.out.println("You got C"); }
        else if (D){
            System.out.println("You got D"); }
        else if (E){
            System.out.println("You got E"); }
        else {
            System.out.println("You got F");
        }}
        else{// grade < 0 ||grade>100
            System.out.println("given grade is not correct"); }






}
}
