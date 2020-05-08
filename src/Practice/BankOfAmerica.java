package Practice;

import java.util.ArrayList;

public class BankOfAmerica {

    public static void main(String[] args) {
        Testers tester1=new Testers();
        tester1.setTesterinfo("Ali",111,"SDET",110000);

        Testers tester2=new Testers();
        tester2.setTesterinfo("Kenan",2222,"Senior SDET",140000);




        Developers developer1=new Developers();
        developer1.setDeveloperinfo("Tural",333,"Senior Developer",200000);

        Developers developer2=new Developers();
        developer2.setDeveloperinfo("Sevda",444,"Master Developer",97000);

        Developers developer3=new Developers();
        developer3.setDeveloperinfo("Esmira",555,"Head Developer",119000);

        Developers developer4=new Developers();
        developer4.setDeveloperinfo("Alisa",666,"Lovely Developer",88000);


        ScrumTeam scrumTeam1=new ScrumTeam();

        scrumTeam1.hireTester(tester1);
        scrumTeam1.hireTester(tester2);
        scrumTeam1.hireDeveloper(developer1);
        scrumTeam1.hireDeveloper(developer2);
        scrumTeam1.hireDeveloper(developer3);
        scrumTeam1.hireDeveloper(developer4);
        double teamBudget1=0;

        for (int i=0;i<scrumTeam1.testersteam.size();i++){
            System.out.println(scrumTeam1.testersteam.get(i));
            teamBudget1+=scrumTeam1.testersteam.get(i).salary;
        }

        for (Developers eachdeveloper:scrumTeam1.developersteam){
            System.out.println(eachdeveloper);
            teamBudget1+=eachdeveloper.salary;
        }
        System.out.println(teamBudget1);
        ScrumTeam scrumTeam2=new ScrumTeam();

        Testers tester3=new Testers();
        tester3.setTesterinfo("Nicat",999,"Small Tester",96000);

        Testers tester4=new Testers();
        tester4.setTesterinfo("Senan",123,"Some Tester",122000);


        Developers developer5=new Developers();
        developer5.setDeveloperinfo("Orxan",543,"Dev Developer",180000);

        Developers developer6=new Developers();
        developer6.setDeveloperinfo("Mehman",764,"Master Developer",110000);

        Developers developer7=new Developers();
        developer7.setDeveloperinfo("Allehveren",975,"Pro Developer",105000);

        Developers developer8=new Developers();
        developer8.setDeveloperinfo("Elchin",365,"Assistant Developer",10000);

        scrumTeam2.hireTester(tester3);
        scrumTeam2.hireTester(tester4);
        scrumTeam2.hireDeveloper(developer5);
        scrumTeam2.hireDeveloper(developer6);
        scrumTeam2.hireDeveloper(developer7);
        scrumTeam2.hireDeveloper(developer8);
        double teamBudget2=0;

        for (int i=0;i<scrumTeam2.testersteam.size();i++){
            System.out.println(scrumTeam2.testersteam.get(i));
            teamBudget2+=scrumTeam2.testersteam.get(i).salary;
        }

        for (Developers eachdeveloper:scrumTeam2.developersteam){
            System.out.println(eachdeveloper);
            teamBudget2+=eachdeveloper.salary;
        }
        System.out.println(teamBudget2);


        Testers tester5=new Testers();
        tester5.setTesterinfo("Aygul",465,"Smoke Tester",117000);

        Testers tester6=new Testers();
        tester6.setTesterinfo("Banu",000,"Mini Tester",125000);

        Testers tester7=new Testers();
        tester7.setTesterinfo("Valid",478,"Tester",135000);


        Developers developer9=new Developers();
        developer9.setDeveloperinfo("Ilham",124,"Developercik",175000);

        Developers developer10=new Developers();
        developer10.setDeveloperinfo("Gunduz",189,"Developer helper",163000);

        Developers developer11=new Developers();
        developer11.setDeveloperinfo("Behruz",479,"Main Developer",110000);

        Developers developer12=new Developers();
        developer12.setDeveloperinfo("Gulay",986,"Global Developer",104000);

        Developers developer13=new Developers();
        developer13.setDeveloperinfo("Shirin",045,"Developer helper",87000);


        ScrumTeam scrumTeam3=new ScrumTeam();
        scrumTeam3.hireTester(tester6);
        scrumTeam3.hireTester(tester7);

        scrumTeam3.hireDeveloper(developer9);
        scrumTeam3.hireDeveloper(developer10);
        scrumTeam3.hireDeveloper(developer11);
        scrumTeam3.hireDeveloper(developer12);
        scrumTeam3.hireDeveloper(developer13);


        ScrumTeam[] arrayofscrum={scrumTeam1,scrumTeam2,scrumTeam3};


       /* for (int k=0;k<arrayofscrum.length;k++){
        for (int i=0;i<sc;i++){
            if (arrayofscrum[i].testersteam.get(i).salary>120000){
            arrayofscrum[i].testersteam.get(i);}
        }


        */











    }
}
