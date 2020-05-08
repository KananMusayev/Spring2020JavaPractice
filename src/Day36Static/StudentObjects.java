package Day36Static;

public class StudentObjects {

    public static void main(String[] args) {


        Student student1=new Student();
            student1.name="Muhtar";
        System.out.println(student1);

        Student student2=new Student();
        System.out.println(student2);
        student2.name="Kuzzat";
        System.out.println(student2.name);
        Student student3=new Student();

        Student.PrintSchoolname();
    }
}
