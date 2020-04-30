package Day34Class_ObjectContinue;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Alisa","111",1,79265726,"CEO",300000);
        obj1.getInfo();
        System.out.println("------------------------");
        Employee obj2=new Employee("Kenan","K.M409",27,265438,"Business owner",240000);

        obj2.getInfo();
        System.out.println("------------------------");

        obj1.Promoted();
        System.out.println("------------------------");
        obj2.Promoted();

    }
}
