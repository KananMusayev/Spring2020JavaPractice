package Day36Static;

public class StaticPractice3 {

    String brand;
    String Model;
    static boolean haswheels=true;//since all the cars has wheels it can be static
    // so it can be shared by all the objects

    public static void haswheels(){
        System.out.println(haswheels);
    }
    public  void printBrand(){//if u had static method it wouldnt compile at line 10
        //bcs u can not call instance variable inside static without calling it by the  object
        System.out.println(brand);
    }
    public void Model(){
        System.out.println(Model);
    }


    public static void main(String[] args) {
        haswheels();
    }
}
