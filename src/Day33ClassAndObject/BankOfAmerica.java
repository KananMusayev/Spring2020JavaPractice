package Day33ClassAndObject;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {

    public static void main(String[] args) {
        Testers tester1=new Testers();
        tester1.setTesterinfo("Madina",61798789,"QA",200000);

        Testers tester2=new Testers();
        tester2.setTesterinfo("Kenan",2345677,"Senior SDET",150000);




        Developers developers1=new Developers();
        developers1.setDevelopersInfo("Alisa",32784327,"Developer",250000);

        Developers developers2=new Developers();
        developers2.setDevelopersInfo("Esmira",56547,"Senior Developer",300000);

        Developers developers3=new Developers();
        developers3.setDevelopersInfo("Kenny",4273603,"Developer",270000);

        Developers developers4=new Developers();
        developers4.setDevelopersInfo("Eli",13425,"Medium Developer",68000);


        ArrayList<Testers> testers=new ArrayList<>(Arrays.asList(tester1,tester2));
        ArrayList<Developers> developers=new ArrayList<>(Arrays.asList(developers1,developers2,developers3,developers4));
        for (Testers eachtester:testers){
            System.out.println(eachtester);
        }
        System.out.println("=================");
        for (Developers eachdeveloper:developers){
            System.out.println(eachdeveloper);
        }

        double totalbudget=0;
        for (int i=0;i<testers.size();i++){
            totalbudget+=testers.get(i).salary;
        }
        for (Developers eachdeveloper:developers){
            totalbudget+=eachdeveloper.salary;
        }

        System.out.println("Total Budget for the scrum team is: $"+totalbudget);


    }
}
