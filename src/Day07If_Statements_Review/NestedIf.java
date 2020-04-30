package Day07If_Statements_Review;

public class NestedIf {
    public static void main(String[] args) {
        if (false) {
            System.out.println("Hello Cybertek");
            if (false) {
                System.out.println("Hello world");
            }
        }

        if (true) {
            System.out.println("Hello Cybertek");
        }
        if (true) {
            System.out.println("Hello world");
        } else {
            System.out.println("Hello Sdet Team");
        }


     /*   Task 1.
        90<=Grade=>100===>A
        80<=Grade>=90====>B
        70<=Grade>=80=====C
        60<=Grade>=70=====>D
        Else===>F
                */
     int Grade = 99;
     if (Grade>=60&&Grade<=100){
         System.out.println("You Passed");
     if (90<=Grade&&Grade<=100){
         System.out.println("With grade A"); }
     else if (80<=Grade&&Grade<90){
         System.out.println("With grade B"); }
     else if (70<=Grade&&Grade<80){
         System.out.println("With grade C"); }
     else {
         System.out.println("With a grade of D");
     }}
    else {
        if (Grade<60) {
            System.out.println("You Failed with a grade of F"); }
        else {
            System.out.println("Invalid Score,Error 401");
        }}









    }}







