package Day07If_Statements_Review;

public class IfelseStatement {
    public static void main(String[] args) {
        /*triangle : has three angles and sum of the angles has to be 180
        1.declear 3 variables called angle1,angle2,angle3
        2.write a program to check if the triangle is valid or not

         */
        int angle1 = 40;
        int angle2 = 60;
        int angle3 = 90;
        if ((angle1+angle2+angle3)>180){
            System.out.println("it is not a triangle");
        }
        else {
            System.out.println("it is a triangle");}
    }
}
