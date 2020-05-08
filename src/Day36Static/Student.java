package Day36Static;

public class Student {

    String name;
    int id;
    double gpa;
    static String schoolname="Cybertek";


    public void setinfo(String name,int id,double gpa,String schoolname){//if we are using any instance
        //then method should not be static
        this.name=name;
        this.gpa=gpa;
        this.id=id;
    }

    public static void PrintSchoolname(){
        System.out.println("School name is : "+schoolname);
    }

    public String  toString(){
        return "Name : "+name+", Gpa is: "+gpa+" Id is: "+id+" School name is: "+schoolname;
    }
}
