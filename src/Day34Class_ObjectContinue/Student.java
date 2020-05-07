package Day34Class_ObjectContinue;

public class Student {

    String name;
    String nationality;
    int age;
    double gpa;
    char gender;
    boolean married;


    public void setstudentinfo (String name,String nationality,int age,double gpa,char gender,boolean married){
        this.name=name;
        this.nationality=nationality;
        this.age=age;
        this.gpa=gpa;
        this.gender=gender;
        this.married=married;
    }
    public String toString(){
        String result=name+" "+age+" "+nationality+" "+gpa+" "+gender+" " +married;
        return result;
    }



    public static void main(String[] args) {

    }
}
