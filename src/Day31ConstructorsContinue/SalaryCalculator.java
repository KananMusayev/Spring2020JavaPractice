package Day31ConstructorsContinue;

public class SalaryCalculator {

    double hourlyRate;
    double weeklyHours;
    double stateTaxRate;
    double fedralTaxRate;

    public SalaryCalculator(double hourlyRate,double weeklyHours,double stateTaxRate,double fedralTaxRate){

        this.fedralTaxRate=fedralTaxRate;
        this.hourlyRate=hourlyRate;
        this.stateTaxRate=stateTaxRate;
        this.weeklyHours=weeklyHours;

    }

    //                salary(): returns the total salary as double

    public double salary (){
        double salary=0;
        return salary=hourlyRate*weeklyHours;
    }
    public double salaryAftertax(){
        double salaryaftertax=0;
        return salaryaftertax=salary()-salary()*stateTaxRate-salary()*fedralTaxRate;
    }
    public double stateTax(){
        double statetax=0;
        return statetax=salary()*statetax;
    }
    public double federalTax(){
        double federaltax=0;
        return federaltax=salary()*federaltax;
    }
    public String toString(){
        return "Hourly rate is: "+hourlyRate+
                    " Weekly hours is: "+weeklyHours+
                            " Salary is: "+salary();
    }
}
