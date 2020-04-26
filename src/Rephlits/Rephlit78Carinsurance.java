package Rephlits;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Rephlit78Carinsurance {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double premium =0;
        System.out.println("Enter your name");
        String name1 = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String driverlicence1= scan.next();
        if (driverlicence1.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0); }
        System.out.println("Enter your zip code");
        int zipcode1=scan.nextInt();
        if (zipcode1==20910||zipcode1==20740){
            premium+=60; }
        else if (zipcode1==22102||zipcode1==22103){
            premium+=30; }
        else {
            premium+=50; }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        String vehicleOwnership1=scan.next();
        if (vehicleOwnership1.equalsIgnoreCase("owned")){
            premium+=10; }
        else {
            premium+=20; }
        System.out.println("How is this vehicle primarily used?");
        String vehicleUsage1=scan.next();
        if (vehicleUsage1.equalsIgnoreCase("Business")){
            premium+=50; }
        else if (vehicleUsage1.equalsIgnoreCase("Pleasure")){
            premium+=10; }
        else if (vehicleUsage1.equalsIgnoreCase("Commute")){
            System.out.println("Days Driven To Work And/Or School");
            int daysDrivenToWorkOrSchool1=scan.nextInt();
            premium+=daysDrivenToWorkOrSchool1*5;
            premium+=20;
            System.out.println("Miles Driven To Work And/Or School");
            int milesToWorkOrSchool1=scan.nextInt();
            premium+=milesToWorkOrSchool1*1; }

        System.out.println("How old are you?");
        int age1 = scan.nextInt();
        if (age1<16){
            System.out.println("Invalid data!");
            System.exit(0);}
        else if (age1>16&&age1<18){
            premium*=20; }
        else if (age1>=18&&age1<=21){
            premium*=6; }
        else if (age1>21&&age1<25){
            premium*=2; }
        System.out.println("How many years you've been driving?");
        int yearsofdriving1=scan.nextInt();
        int substractionage1 = age1-yearsofdriving1;
        if (yearsofdriving1>0&&substractionage1>=16){
            premium-=5*yearsofdriving1; }
        else if (yearsofdriving1<0&&substractionage1<16){
            System.out.println("Invalid data!");
            System.exit(0);}
        System.out.println("Have you had any accidents in the last 5 years?");
        String acddicentorno1=scan.next();
        if (acddicentorno1.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int accidentsAmount1 =scan.nextInt();
            premium+=((premium*0.2)*accidentsAmount1); }
        else if (acddicentorno1.equalsIgnoreCase("no")){
            premium+=0; }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        String continuousInsurance1=scan.next();
        if (continuousInsurance1.equalsIgnoreCase("no")){
            premium*=2; }
        else if (continuousInsurance1.equalsIgnoreCase("yes")){
            premium+=0; }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        String education1 = scan.nextLine();
        if (education1.equalsIgnoreCase("phd")||education1.equalsIgnoreCase("bachelors")||education1.equalsIgnoreCase("masters")) {
            premium-=(premium*0.05); }
        else if (education1.equalsIgnoreCase("doctors")){
            premium-=(premium*0.1); }
        else if (education1.equalsIgnoreCase("Less than High School")){
            premium+=(premium*0.05); }
        System.out.println(name1+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        String referenceNumber1 = "";
        referenceNumber1+=name1.substring(0,2).toUpperCase();
        String total=referenceNumber1+age1+name1.substring(name1.length()-2,name1.length())+zipcode1+education1.replace(" ","");
        total=total.toUpperCase();
        String Result ="Reference number: "+total;
        System.out.println(Result);





    }
}
