package Rephlits;

public class Person {

   private String firstname;
   private String lastname;
   private int birthmonth;
   private int birthday;
   private int birthyear;
   private String ssn;

   public Person(String firstname,String lastname,int birthmonth,int birthday,int birthyear,String ssn){

       this.firstname=firstname;
       this.lastname=lastname;
       this.birthmonth=birthmonth;
       this.birthday=birthday;
       this.birthyear=birthyear;
       this.ssn=ssn;
   }
   public String getFirstname(){
       return firstname;
   }
   public void setFirstname(String firstname){
       this.firstname=firstname;
   }
   public String getLastname(){
       return lastname;
   }
   public void setLastname(String lastname){
       this.lastname=lastname;
   }
   public String getBirthday(){
       String result="";
       result=birthmonth+"/"+birthday+"/"+birthyear;
       return result;
   }
   public boolean verifySSN(String a){
       boolean result=false;
       String b=""+ssn;
       if (b.equals(a)){
           result=true;
       }
       return result;
   }
}
