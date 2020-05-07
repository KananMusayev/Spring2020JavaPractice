package Day33ClassAndObject;

public class Developers {
    String name;
    int employeeID;
    String jobTitle;
    int salary;



    public String toString(){
        return name+" "+employeeID+" "+jobTitle+" "+salary;
    }
    public void coding(){
        System.out.println(name+" is doing coding for building the application");
    }
    public void fixingBugs(){
        System.out.println(name+" is fixing bugs");
    }
    public void setDevelopersInfo(String name,int employeeID,String jobTitle,int salary){


        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
}
