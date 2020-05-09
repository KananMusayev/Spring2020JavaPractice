package Day36Static;

import Practice.Developers;

public class HumanResources {


    static      Developers developer1=new Developers();

    static      Developers developer2=new Developers();

    static      Developers developer3=new Developers();

    static      Developers developer4=new Developers();

    static      Developers developer5=new Developers();

    public static void main(String[] args) {
        developer1.setDeveloperinfo("Ali",124,"Developer",150000);
        developer2.setDeveloperinfo("Ahmet",145,"Medium developer",123000);
        developer3.setDeveloperinfo("Gultekin",423,"Master developer",200000);
        developer4.setDeveloperinfo("Mishka",111,"Mishka Developer",155000);
        developer5.setDeveloperinfo("Alisa",888,"Alisa Developer",300000);

        //this is not gonna print out in other class
    }

    static {

        developer1.setDeveloperinfo("Ali",124,"Developer",150000);
        developer2.setDeveloperinfo("Ahmet",145,"Medium developer",123000);
        developer3.setDeveloperinfo("Gultekin",423,"Master developer",200000);
        developer4.setDeveloperinfo("Mishka",111,"Mishka Developer",155000);
        developer5.setDeveloperinfo("Alisa",888,"Alisa Developer",300000);

    }

}
