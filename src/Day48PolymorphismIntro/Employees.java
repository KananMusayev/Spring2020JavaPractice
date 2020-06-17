package Day48PolymorphismIntro;


import Day46AbstractContinue.Employee;

public abstract class Employees {

    private String employeeName;
    private int employeeId;
    private double salary;
    private int ssn;
    private String JobtiTle;
    private boolean isFullTime;
    private boolean hasPTO;

    //setters below

    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName; }
    public void setJobtiTle(String JobtiTle){
        this.JobtiTle=JobtiTle; }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId; }
    public void setSalary(double salary){
        this.salary=salary; }
    public void setSsn( int ssn){
        this.ssn=ssn; }
    public void setFullTime(boolean isFullTime){
        this.isFullTime=isFullTime; }
    public void setHasPTO(boolean hasPTO){
        this.hasPTO=hasPTO; }

        //getters below
    public boolean getisFullTime(){
        return isFullTime; }
    public boolean gethasPto(){
        return hasPTO; }
    public double getSalary(){
        return salary; }
    public int getEmployeeId(){
        return employeeId; }
    public int getSsn(){
        return ssn; }
    public String getEmployeeName(){
        return employeeName; }
    public String getJobtiTle(){
        return JobtiTle; }




    public abstract void work();
    public abstract void meeting();

    public String toString(){
        return "Employee name: "+employeeName+" employeeId: "+employeeName+" salary: "+salary+" ssn: "+ssn+" JobtiTle: "+JobtiTle+" isFullTime: "+isFullTime+" hasPTO: "+hasPTO;
    }


}
interface ScrumTeam{
    boolean has_ScrumMaster=false;

    void dailyStandUp();
}
interface WorkRemotely{

    void workFromHome();

}

final class Tester extends Employees implements WorkRemotely, ScrumTeam {


    public void creatingTicket(){

    }
    public void findingBug(){

    }


    @Override
    public void work() {

    }

    @Override
    public void meeting() {

    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void workFromHome() {

    }
}

final class Developer extends Employees implements WorkRemotely, ScrumTeam {

    public Developer(String employeeName){
        //to be continued
    }




    @Override
    public void work() {

    }

    @Override
    public void meeting() {

    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void workFromHome() {

    }
}

