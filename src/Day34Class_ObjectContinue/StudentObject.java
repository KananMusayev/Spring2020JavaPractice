package Day34Class_ObjectContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setstudentinfo("Adam","England",34,3.5,'M',true);

        Student student2=new Student();
        student2.setstudentinfo("Mike","German",30,3,'M',false);

        Student student3=new Student();
        student3.setstudentinfo("John GUitar","US",40,2.5,'M',false);

        Student student4=new Student();
        student4.setstudentinfo("Anna","Ukrain",33,3.9,'F',true);
        Student[] students={student1,student2,student3,student4};

        ArrayList<Student> canFraduate=new ArrayList<>(Arrays.asList(students));
        canFraduate.removeIf(p-> p.gpa<=3.0);
        System.out.println(canFraduate.size());

        for (int i=0;i<canFraduate.size();i++){
            Student each=canFraduate.get(i);
            System.out.println(each.name+" can graduate");
        }

        ArrayList<Student> canNotgraduate=new ArrayList<>(Arrays.asList(students));
        System.out.println(canNotgraduate);
        canNotgraduate.removeIf(p->p.gpa>3);
        for (Student each:canNotgraduate){
            Student each1=each;
            System.out.println(each1.name+" can not graduate");
        }
        //or



    }
}
