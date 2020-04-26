package Examples;

import sun.awt.CGraphicsConfig;

public class NestedIf {
    public static void main(String[] args) {
        /*
        0-59==>F
        60-70==>D
        70-80==>C
        80-90==>B
        90-100==>A

         */
        int Grade = 23;
        if (Grade>0&&Grade<=100){
            if (Grade>=90&&Grade<100){
                System.out.println("You Got A"); }
                else if (Grade>=80&&Grade<90){
                System.out.println("You Got B");}
            else if (Grade>=70&&Grade<80){
                System.out.println("You Got C");}
            else if (Grade>=60&&Grade<70){
                System.out.println("You Got D");}
            else {
                System.out.println("You Failed");}

        }else{
                System.out.println("Invalid Grade"); } }
    }
