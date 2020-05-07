package Day33ClassAndObject;

public class Cat {

    String breed;
    String color;
    int age;
    String name;
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void eat(String food){
        food="Cat food";
        System.out.println(name+" is eating "+food);

    }
    public void drink(String drink){
        drink="milk";
        System.out.println(name+" is drinking "+drink);

    }

    public void catinfo(String Bbread,String Bcolor,int Bage,String Bname){

        breed=Bbread;
        name=Bname;
        age=Bage;
        color=Bcolor;
    }
    public String toString(){
       String result=breed+" "+name+" "+age+" "+color;
        return result;
    }

}
