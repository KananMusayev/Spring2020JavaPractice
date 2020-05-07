package Day34Class_ObjectContinue;

public class Dog {

    String breed;
    double size;
    int age;
    String color;
    String name;


    public String toString(){
        String dog=breed+" "+size+" "+age+" "+color+" "+name;
        return dog;
    }
    public void setdoginfo(String breed,double size, int age, String color,String name){
        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
        this.name=name;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food); }
    public void sleep( String  place){
        System.out.println(name+" is sleeping on a"+place); }
    public void run(String outside ){
        System.out.println(name+" is running in the "+outside); }
    public void sit(String bench){
        System.out.println(name+" is sitting on the "+bench); }




    public static void main(String[] args) {

    }
}
