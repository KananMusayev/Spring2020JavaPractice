package Practice;

public class Developers {

    String name;
    long employeeID;
    String jobTitle;
    double salary;



    public void coding(){
        System.out.println(name+" is coding"); }
    public void fixingBugs(){
        System.out.println(name+" is crying"); }
    public String toString(){
        return "Name is: "+name+
                " Job title is: "+jobTitle+
                " EmployeeID is: "+employeeID+
                " Salary is: $"+salary; }

    public void setDeveloperinfo(String name, long employeeID, String jobTitle, double salary){
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.name=name;
        this.salary=salary; }
}
