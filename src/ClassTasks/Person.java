package ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    public String name;
    public char gender;
    public int age;

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void walk(){
        System.out.println(name+" is walking");

    }
    public void sleep(){
        System.out.println(name+" is sleeping");

    }
    public void setPersonInfo(String name, char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }}












    class Employee extends Person {
        double salary;
        long employeeID;
        String jobTitle;

        public void work() {
            System.out.println(name + " is working");
        }

        public void setEmployeeInfo(String name, int age, char gender, double salary, long employeeID, String jobTitle) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.salary = salary;
            this.employeeID = employeeID;
            this.jobTitle = jobTitle;
        }

        public String toString(){
            return "Name is: "+name+" age is: "+age+" gender is: "+gender+" salary is: "+" employeeID is: "+employeeID+" Jobtitle is: "+jobTitle;
        }
    }






        class Student extends Person{

            String clazz;
            long studentID;

            public void attendClass(){
                System.out.println(name+" is attending "+clazz);
            }
            public void code(){
                System.out.println(name+ " is coding ");
            }
            public void setstudentInfo(String name, int age,char gender,long studentID,String clazz){
                this.name=name;
                this.age=age;
                this.gender=gender;
                this.studentID=studentID;
                this.clazz=clazz;
            }
            public String toString(){
                return "Name is: "+name+" age is: "+age+" gender is: "+gender+" StudentID is: "+studentID+" class is: "+clazz;
            }



        }






        class school extends Student{
            public static void main(String[] args) {


                Student student1 = new Student();
                student1.setstudentInfo("Ali",14,'m',37463274,"A class");
                Student student2 = new Student();
                student2.setstudentInfo("Alisa",5,'f',88888888,"Class Best");
                Student student3 = new Student();
                student3.setstudentInfo("Esmira",26,'f',61546354,"Class master");
                ArrayList<Student> studentlist=new ArrayList<>(Arrays.asList(student1,student2,student3));
            for (Student each:studentlist){
                System.out.println(each);
            }
            }

        }


        class company extends Employee{


            public static void main(String[] args) {

                Employee employee1=new Employee();
                employee1.setEmployeeInfo("Elchin",24,'m',150000,2353453,"Cashier");
                Employee employee2=new Employee();
                employee2.setEmployeeInfo("Mary",34,'f',140000,374234,"Reception");
                Employee employee3=new Employee();
                employee3.setEmployeeInfo("Tyler",30,'m',130000,136536,"Senior Sdet");

                Employee[] employees=new Employee[3];
                employees[0]=employee1;
                employees[1]=employee2;
                employees[2]=employee3;
                for (int i=0;i<employees.length;i++){
                    System.out.println(employees[i]);
                }
            }
        }


