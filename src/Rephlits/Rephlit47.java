package Rephlits;

import java.util.Scanner;

public class Rephlit47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int propertyPrice = 0;
        System.out.println("Enter your property type:");
        String propertytype1=input.nextLine();
        if (propertytype1.equalsIgnoreCase("Condo")){
                propertyPrice+=50000 ;}
        else if (propertytype1.equalsIgnoreCase("Townhouse")){
            propertyPrice+=75000; }
        else if (propertytype1.equalsIgnoreCase("Single Family Home")){
            propertyPrice+=95000; }
        System.out.println("How many bedrooms do you have?");
        int numberofbedrooms=input.nextInt();
        int bedroomprice=30000;
        propertyPrice+=bedroomprice*numberofbedrooms;
        System.out.println("Do you have a backyard?");
        boolean backyard=input.nextBoolean();
        if (backyard==true&&propertytype1.equalsIgnoreCase("Condo")){
            System.out.println("Backyard is not available for condo!"); }
        else if (backyard==true){
            propertyPrice+=5000; }
        System.out.println("Do you have garage?");
        boolean garageyesorno = input.nextBoolean();
        System.out.println("How many spots?");
        int garagecount = input.nextInt();

        if (garageyesorno==true&&garagecount<10){
            propertyPrice+=garagecount*20000; }
        else if (garagecount>10){
            System.out.println("Pardon, it's not a public parking!");}
        System.out.println("How close is metro station?");
        double metrodistance=input.nextDouble();
        if (metrodistance>0&&metrodistance<=1){
            propertyPrice+=10000; }
        else if (metrodistance>1&&metrodistance<3){
            propertyPrice+=5000; }
        System.out.println("How close is highway?");
        double highwaydistance = input.nextDouble();
        if (highwaydistance>0&&highwaydistance<=1){
            propertyPrice+=15000; }
        else if (highwaydistance>1&&highwaydistance<5){
            propertyPrice+=8000; }
        else if (highwaydistance>5&&highwaydistance<=20){
            propertyPrice+=4000; }
        System.out.println("What's the rating of nearest school?");
        int schoolrating = input.nextInt();
        if (schoolrating>=8&&schoolrating<=10){
            propertyPrice+=45000; }
        else if (schoolrating<8&&schoolrating>=4){
            propertyPrice+=20000; }
        else if (schoolrating<4){
            propertyPrice+=5000; }
        System.out.println("Does any of your family members smoking?");
        boolean smokingornot = input.nextBoolean();
        if (smokingornot==true){
            propertyPrice-=5000; }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertytype1+"$");








}}
