package day10Ternary_and_Scanner;

public class TernaryandScanner {
    public static void main(String[] args) {
        int num = 0;
        if (true) {//true?100:50
            num = 100;
        } else {
            num = 50;
        }
        System.out.println(num);

        int n = (false) ? 100 : 50;// if==100 else ==50
        System.out.println(n);
        System.out.println(num);


        String SchoolName = "";
        boolean Batch12 = true;

        if (Batch12) {
            SchoolName = "Cybertek";
        } else {
            SchoolName = "Invalid";
        }
        String BestSchool = Batch12 ? "Cybertek" : "Invalid";
        System.out.println(BestSchool);


        double INterestRate = 0;
        boolean GoodCredit = true;

        INterestRate = GoodCredit ? 0.5 : 0.9;

        System.out.println(INterestRate);

        byte grade = 60;
        boolean passed = grade >= 60 ? true : false;
        System.out.println(passed);

        char FinalGrade = 'C';
        String Group = "";

        if (FinalGrade == 'A') {
            Group = "Early Bird"; }
        else if (FinalGrade == 'B') {
            Group = " Group 1"; }
        else {
            Group = "After Group !"; }



       Group= FinalGrade=='A'?"Early Bird":FinalGrade=='B'?"Group 1":FinalGrade=='C'?"Group 2":"After Group 1";
        System.out.println(Group);



    }
    }