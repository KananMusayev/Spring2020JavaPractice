package Day48PolymorphismIntro;

public class Burger implements Edible {
    String name;
    int size;

    public Burger(String name,int size){
        this.name=name;
        this.size=size;
    }

    public String toString(){
        return name+" "+size;
    }
    @Override
    public void eat() {

    }
}
