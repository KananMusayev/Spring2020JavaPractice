package Day34Class_ObjectContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BankofAmericaObject {

    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.settestersinfo("Madina",61798789,"QA",200000);

        Tester tester2=new Tester();
        tester2.settestersinfo("Venera",2345677,"Senior SDET",150000);

        Tester tester3=new Tester();
        tester3.settestersinfo("Kenan Musayev",624355,"SDET",120000);

        Tester tester4=new Tester();
        tester4.settestersinfo("Muhtar",111,"Manual tester",120000);

        Tester tester5=new Tester();
        tester5.settestersinfo("John",2222,"Uber Driver",60000);


        System.out.println(tester2);


        System.out.println("=======================");
       ArrayList<Tester> testers=new ArrayList<>(Arrays.asList(tester1,tester2,tester3,tester4,tester5));
        for (int i=0;i<testers.size();i++){
            testers.removeIf(p->!p.jobTitle.contains("SDET"));
        }
        double totalBudget=0;
        for (Tester eachtester:testers){

            System.out.println(eachtester.name);
            totalBudget+=eachtester.salary;
        }
        System.out.println(totalBudget);




            //OR testers.addAll(Arrays.asList(tester1,tester2,tester3));


    }


}
