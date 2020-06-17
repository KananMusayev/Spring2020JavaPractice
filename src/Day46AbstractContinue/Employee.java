package Day46AbstractContinue;

public abstract class Employee {
    String name;
    int age;
    char gender;
    String jobtitle;
    int salary;

     protected abstract void work();

     public String toString(){
         return "Name is: "+name+" age is: "+age+" gender is: "+gender+" jobtitle is: "+jobtitle+" salary is: "+salary;
     }
}

/*public class Tester extends Employee{



}
public class Developer extends Employee{

}

 */
