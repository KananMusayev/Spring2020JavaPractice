package CodingBat;

public class Telephone {

    String number;
    static int quantity=250;
    static double total=15658.92;

    public String  getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number=number;
    }
}

class A{
    public static void main(String[] args) {

        Telephone obj = new Telephone();
        System.out.println(obj);
    }
}
