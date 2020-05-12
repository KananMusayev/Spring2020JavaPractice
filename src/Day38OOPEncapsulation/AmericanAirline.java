package Day38OOPEncapsulation;

public class AmericanAirline {

    public static void main(String[] args) {


        EmployeeInfo kenan=new EmployeeInfo();
        kenan.setName("Kenan");
        kenan.setAge((byte)26);
        kenan.setSalary(150000);
        kenan.setSSN(666777888);

        System.out.println(kenan.getAge());
        System.out.println(kenan.getName());
        System.out.println(kenan.getSalary());
        System.out.println(kenan.getSSN());

        EmployeeInfo alisa=new EmployeeInfo();

        alisa.setSSN(778885554);
        alisa.setSalary(180000);
        alisa.setName("Alisa");
        alisa.setAge((byte)1);
        System.out.println(alisa.getAge());
        System.out.println(alisa.getName());
        System.out.println(alisa.getSalary());
        System.out.println(alisa.getSSN());


        alisa.setInfo("Esmira",180000,2436273,(byte)26);
        System.out.println(alisa);
    }
}
