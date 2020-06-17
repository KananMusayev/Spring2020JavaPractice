package Day48PolymorphismIntro;

public interface onlineEducation {

    boolean onlineStudent=false;
     void attendClass();

}
interface Cybertek extends onlineEducation{
    String schoolName="Cybertek";
    boolean requiresITBackGround=false;

}



class Student extends CybertekSchool implements onlineEducation {


    private String studentName;
    private int age;
    private int grade;
    private boolean has_ITBackGround;

    public Student(String studentName,int age,int grade,boolean has_ITBackGround){
        this.studentName=studentName;
        this.age=age;
        this.grade=grade;
        this.has_ITBackGround=has_ITBackGround;

    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public void setHas_ITBackGround(boolean has_ITBackGround){
        this.has_ITBackGround=has_ITBackGround;
    }



    public String getStudentName(){
        return studentName;
    }
    public int getAge(){
        return age;
    }
    public int getGrade(){
        return grade;
    }
    public boolean getisHas_ITBackGround(){
        return has_ITBackGround;
    }
    public void studying(){
        System.out.println(studentName +" is studying");
    }
    public void takingBreaks(){
        System.out.println(studentName +" is taking brake");

    }
    public String toString(){
        return "student name : "+studentName+"student age : "+age+"student grade : "+grade+"student experience result : "+has_ITBackGround;
    }





    @Override
    public void attendClass() {

    }


}

class CybertekSchool implements Cybertek{


    Student student1=new Student("Alisa",20,1,true);
    Student student2=new Student("Esmira",26,11,true);
    Student student3=new Student("Kenan",26,10,false);
    Student student4=new Student("Ehmed",19,9,true);
    Student student5=new Student("Gulay",21,8,false);

    Cybertek[] list={student1,student2,student3,student4,student5};

    @Override
    public void attendClass() {

    }
}

