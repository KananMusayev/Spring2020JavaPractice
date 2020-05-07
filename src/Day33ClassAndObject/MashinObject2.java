package Day33ClassAndObject;

public class MashinObject2 {

    public static void main(String[] args) {


        Mashin mashin1=new Mashin();
        mashin1.setmashinmelumatlari("Lx 450","Lexus",80000,2018);
        Mashin mashin2=new Mashin();
        mashin2.setmashinmelumatlari("Dogan SLX","Tofash",4546,2013);
        Mashin mashin3=new Mashin();
        mashin3.setmashinmelumatlari("AMG 6.3","Mercedes",96000,2018);
        Mashin mashin4=new Mashin();
        mashin4.setmashinmelumatlari("2107","Vaz",4200,2011);
        Mashin mashin5=new Mashin();
        mashin5.setmashinmelumatlari("Sorento","Kia",8900,2005);

        Mashin[] array={mashin1,mashin2,mashin3,mashin4,mashin5};
        for (int i=0;i<array.length;i++){
            array[i].mashinmelumatlari();
        }

        System.out.println("================");

        for (Mashin each:array){
            each.mashinmelumatlari();
        }

        System.out.println("=================");
        System.out.println(mashin1);
    }
}
