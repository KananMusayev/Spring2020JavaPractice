package Day33ClassAndObject;

public class EmployeeObjects {
    public static void main(String[] args) {

    Employee emp=new Employee();
    emp.EmployeeName="Ali";
    emp.Gender='M';
    emp.Jobtitle="Manager assistant";
    emp.SSN=21435454;
    emp.Salary=140000;
    emp.CompanyName="Toyota";

    emp.getInfo();
    }
}
