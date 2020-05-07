package Day34Class_ObjectContinue;

public class Tester {
    String name;
    int employeeID;
    String jobTitle;
    double salary;

    public void settestersinfo(String name,int employeeID,String jobTitle,double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public String toString(){
        String result=name+" "+employeeID+" "+jobTitle+" "+salary;
        return result;
    }

    public void smoketesting(){
        System.out.println(name+" is doing smoke testing");
    }
    public void creatingticket(){
        System.out.println(name+" is creating a ticket");
    }

    public void budget(){

    }
}
