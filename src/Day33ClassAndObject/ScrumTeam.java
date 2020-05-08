package Day33ClassAndObject;

import Day34Class_ObjectContinue.Tester;

import java.util.ArrayList;

public class ScrumTeam {

    String name;
    ArrayList<Testers>testerteam=new ArrayList<>();
    ArrayList<Developers>developerteam=new ArrayList<>();


    public void hireTester(Testers testers){
        testerteam.add(testers);
    }
    public void fireTester(int employeeID){
        developerteam.removeIf(p->p.employeeID==employeeID);
    }
    public void hireDeveloper(Developers developers){
        developerteam.add(developers);
    }
    public void fireDeveloper(int employeeID){
        developerteam.removeIf(p->p.employeeID==employeeID);
    }
    public void DailyStandup(){

    }


}
