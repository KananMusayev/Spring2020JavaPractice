package Day38OOPEncapsulation;

public class EmployeeInfo {

    /*
    Name
    SSN
    Age
    Salary
     */
    private String Name;
    private int SSN;
    private byte Age;
    private double Salary;

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public int getSSN(){
        return SSN;
    }
    public void setSSN(int SSN){
        this.SSN=SSN;

    }

    public int getAge(){
        return Age;
    }
    public void setAge(byte Age){
        this.Age=Age;
    }
    public double getSalary(){
        return Salary;
    }
    public void setSalary(double Salary){
        this.Salary=Salary;
    }
    public void setInfo(String Name,double Salary,int SSN,byte Age){
        setName(Name);
        setAge(Age);
        setSalary(Salary);
        setSSN(SSN);
    }
    public String toString(){
        return SSN+" "+Name+" "+ Age+" "+Salary;
    }




}
