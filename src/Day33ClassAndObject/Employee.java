package Day33ClassAndObject;

public class Employee {

    /*
    create a custom class for Employees
        attributes:
            EmployeeName
            EmployeeID
            JobTitle
            SSN
            Gender
            Salary

       Actions:
            getInfo

     */

    String EmployeeName;
    String Jobtitle;
    int SSN;
    char Gender;
    double Salary;
    String CompanyName;


    public void getInfo(){
        System.out.println(EmployeeName+" is working as a "+Jobtitle+" at "+CompanyName+" and is making around $"+Salary+" a year. "+EmployeeName+" 's social security number is "+SSN +" and "+EmployeeName +" is a "+Gender);

    }
    public static void main(String[] args) {

    }

}
