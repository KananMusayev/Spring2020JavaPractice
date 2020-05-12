package Day36Static;

public class humanresorces {



    static Employee employee1=new Employee();
    static Employee employee2=new Employee();
    static Employee employee3=new Employee();
    static Employee employee4=new Employee();
    static Employee employee5=new Employee();


    static {
        employee1.setemployeeinfo("Alisa",1234,536565,"Developer",160000,'f');
        employee2.setemployeeinfo("Kenan",2432,345425,"Father",190000,'m');
        employee3.setemployeeinfo("Esmira",3545,235672,"Mother",200000,'f');
        employee4.setemployeeinfo("Senan",3222,465767,"Brother",179000,'m');
        employee5.setemployeeinfo("Nicat",8374,326364,"Brother in law",180000,'m');
    }


}
