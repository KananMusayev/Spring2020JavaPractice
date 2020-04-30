package day02Variables;

public class LiratoUsd {
    public static void main(String[] args) {

        double rate = 55;
        double stataTaxrate = 0.04;
        double federalTaxrate = 0.22;

        byte weeklyHours = 40;
        double salary = 55*40*52;
        double statetax = salary*stataTaxrate;
        double federaltax = salary*federalTaxrate;
        double totaltax = statetax+federaltax;
        double incomeaftertax = salary-totaltax;
        System.out.println("Your salary is : "+salary);
        System.out.println("State tax is : "+statetax);
        System.out.println("your salary is: "+incomeaftertax);






    }


}

