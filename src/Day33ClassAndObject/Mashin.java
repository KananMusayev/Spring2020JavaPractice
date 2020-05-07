package Day33ClassAndObject;

public class Mashin {

    String marka;
    String model;
    int qiymet;
    int ili;


    public String  toString(){
        String result=ili+" "+marka+" "+model+" $"+qiymet;
        return result;
    }
    public void mashinmelumatlari(){
        System.out.println(ili+" "+marka+" "+model+" $"+qiymet);
    }


    public void setmashinmelumatlari(String Mmodel,String Mmarka,int Mqiymet,int Mili){
        marka=Mmarka;
        model=Mmodel;
        qiymet=Mqiymet;
        ili=Mili;

    }
    public static void main(String[] args) {

    }
}
