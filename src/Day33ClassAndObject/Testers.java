package Day33ClassAndObject;

public class Testers {
    String name;
    int employeeID;
    String jobTitle;
    int salary;



    public String toString(){
        return name+" "+employeeID+" "+jobTitle+" "+salary;
    }

    public void smokeTesting(){
        System.out.println(name+" is doing smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating a ticket");
    }
    public void setTesterinfo(String name,int employeeID,String jobTitle,int salary){

        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }

}
