package Rephlits;

import java.util.Scanner;

public class Rephlit51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Split = input.next();
        double numberofpeople = input.nextInt();
        double totaltopay = input.nextDouble();
        String Servicequality=input.next();

        double tip = 0;

        if(Servicequality.equalsIgnoreCase("poor")){
            tip+=totaltopay*0.05;
            totaltopay+=tip;}
        else if (Servicequality.equalsIgnoreCase("Fair")){
            tip+=totaltopay*0.1;
            totaltopay+=tip;}
        else if (Servicequality.equalsIgnoreCase("Good")){
            tip+=totaltopay*0.15;
            totaltopay+=tip;}
        else if (Servicequality.equalsIgnoreCase("Great")){
            tip+=totaltopay*0.2;
            totaltopay+=tip;}
        else if (Servicequality.equalsIgnoreCase("Excellent")){
            tip+=totaltopay*0.25;
            totaltopay+=tip;}
        double totalperperson = totaltopay/numberofpeople;
        double tipperperson = tip/numberofpeople;
        String a = "&" +
                "" +
                "&&&";
        String b = "&&&&&";
        String c = "&&&";
        String d = "&&";
        String e = "&";
        String number="";
        if (numberofpeople==4){
            number+=a; }
        else if (numberofpeople==5){
            number+=b; }
        else if (numberofpeople==3){
            number+=c; }
        else if (numberofpeople==2){
            number+=d; }
        else if (numberofpeople==1){
            number+=e; }

        System.out.println("Split:");
        System.out.println("Number of people:");
        System.out.println("Check amount:");
        System.out.println("Service Quality:");
        System.out.println("Number of people entered: "+number);
        System.out.println("Total to pay: "+totaltopay);
        System.out.println("Total tip: "+tip);
        System.out.println("Total per person: "+totalperperson);
        System.out.println("Tip per person: "+tipperperson);
    }
}
