package Day36Static;

public class Employee {
    String name;
    int id;
    int ssn;
    String jobTitle;
    long salary;
    char gender;

    public void setemployeeinfo(String name, int id, int ssn, String jobTitle, long salary, char gender){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;

    }

    public String toString(){
        return name+" "+id+" "+salary+" "+jobTitle+" "+ssn+" "+gender;
    }

}
