package Day34Class_ObjectContinue;

public class CapitolOne {
    public static void main(String[] args) {


        Tester tester1 = new Tester();
        tester1.settestersinfo("Muhtar",123,"Manual Tester",70000);

        ScrumTeam scrum = new ScrumTeam();

        scrum.hireTester(tester1);
        System.out.println(scrum.testersteam.size());

        scrum.fireTester(123);
        System.out.println(scrum.testersteam.size());
    }
}
