package Practice;

import java.util.ArrayList;

public class ScrumTeam {
    ArrayList<Testers> testersteam=new ArrayList<>();
    ArrayList<Developers> developersteam=new ArrayList<>();

    public void hireTester(Testers testers){
        testersteam.add(testers);
    }
    public void fireTester(long empID){
        testersteam.removeIf(eachtester->eachtester.employeeID==empID);
    }
    public void hireDeveloper(Developers developers){
        developersteam.add(developers);
    }
    public void fireDeveloper(long empID){
        developersteam.removeIf(p->p.employeeID==empID);
    }
    public void DailyStandUp (){

    }

     /*

        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers

        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000

        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000

           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only

         */

}
