package Day40Inheritance;


import java.util.ArrayList;
import java.util.Arrays;

class Credentials{
  private String userName;
  private String Password;

  public Credentials(){
      setUsername("admin");
      setPassword("333555");
  }

  public void setUsername( String userName){
      this.userName=userName;

  }
  public void setPassword(String Password){
      this.Password=Password;
  }

  public String getUserName(){
      return userName;
  }
  public String getPassword(){
      return Password;
  }


  public void setcredentials(String userName,String Password){
     // this.userName=userName;
     // this.Password=Password;
      setUsername(userName);
      setPassword(Password);//since we had same thing as we had in setter classes we just called them
  }

  public void getInfo(){
      System.out.println("Username: "+getUserName());
      System.out.println("Password: "+getPassword());
  }
}
public class Encapsulationreview extends Credentials{

    public static void main(String[] args) {

        Credentials Kenan=new Credentials();
        //obj1.userName="Kenny";//private access modifier is only visible within the class
       // obj1.Password="12345";//private access modifier is only visible within the class

        //read:
        System.out.println(Kenan.getUserName());
        System.out.println(Kenan.getPassword());
        Credentials Alisa=new Credentials();

        System.out.println(Alisa.getUserName());
        System.out.println(Alisa.getPassword());
        Alisa.setPassword("1567");
        Alisa.setUsername("Esmira");
        System.out.println(Alisa.getUserName());
        System.out.println(Alisa.getPassword());


        Credentials Esmira=new Credentials();
        Esmira.setcredentials("Natavan","7777");
        Esmira.setPassword("789");//compiler takes the last initialization
        System.out.println("Username: "+Esmira.getUserName());
        System.out.println("Password: "+Esmira.getPassword());

        Esmira.getInfo();

        Credentials[] users={Kenan,Esmira,Alisa};
        System.out.println("=======================");
        users[0].getInfo();
        users[1].getInfo();
        users[2].getInfo();
        System.out.println("=======================");

        for (Credentials each: users){
            each.getInfo();
        }

        System.out.println("=======================");

        ArrayList<Credentials> credentialslist=new ArrayList<>();
        //OR
        credentialslist.addAll(Arrays.asList(Kenan,Esmira,Alisa));
        for (Credentials each:credentialslist){
            each.getInfo();
        }
    }




}
