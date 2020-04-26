package Examples;

public class Triangle {
    public static void main(String[] args) {
        /*
        . A triangle is valid if the sum of all
        the three angles is equal to 180 degrees. Write a program that
        declares three integers as
        angles and check whether a triangle is valid or not.
         */

        int angle1=24;
        int angle2=180;
        int angle3=24;
        boolean validtriangle = (angle1+angle2+angle3)<=180;
        boolean NOtValidTriangle = (angle1+angle2+angle3)>=180;

        if (validtriangle){
            System.out.println("Triangle is valid"); }
        if (NOtValidTriangle){
            System.out.println("Triangle is not valid"); }
    }
}
