package Day34Class_ObjectContinue;

public class Employee {
    String EmployeeName;
    String EmployeeID;
    int    age;
    int    SSN;
    String JobTitle;
    double Salary;

    public void Promoted(){
        System.out.println(EmployeeName+" is promoted to higher position");
        Salary+=50000;
        System.out.println("Dear: "+EmployeeName+", Congratulations! Your new Salary is: "+Salary);
    }

    public Employee (String EmployeeName,String  EmployeeID,int age,int SSN,String JobTitle,double Salary){
        this.EmployeeName=EmployeeName;
        this.EmployeeID=EmployeeID;
        this.age=age;
        this.SSN=SSN;
        this.JobTitle=JobTitle;
        this.Salary=Salary;
    }


    public void getInfo(){
        System.out.println("Emplyoyee's name is: "+EmployeeName);
        System.out.println("Social security number is: "+SSN);
        System.out.println("Age is: "+age);
        System.out.println("Job title is: "+JobTitle);
        System.out.println("Salary is: $"+Salary);
        System.out.println("EmployeeId is : "+EmployeeID);

    }




}
