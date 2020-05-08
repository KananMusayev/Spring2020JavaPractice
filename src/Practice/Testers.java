package Practice;

public class Testers {

    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterinfo(String name, long employeeID, String jobTitle, double salary){
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return "Name is: "+name+
                     " Job title is: "+jobTitle+
                             " EmployeeID is: "+employeeID+
                                     " Salary is: $"+salary;
    }
    public void smokeTesting(){
        System.out.println(name+" is doing smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating a ticket in Jira");
    }

}
