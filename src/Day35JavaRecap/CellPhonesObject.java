package Day35JavaRecap;

import java.util.Arrays;

public class CellPhonesObject {
    public static void main(String[] args) {


        CellPhones phone1=new CellPhones("Apple",6.3,"Green",1149,"11 Pro");

        phone1.call(5044273603L);
        phone1.getInfo();
        System.out.println("====================================");

        CellPhones phone2=new CellPhones("Motorolla",200,"Gray",6.1,"z2 play");
        phone2.getInfo();
        CellPhones phone3=new CellPhones("Nokia",20,"black",3," 3300");
        System.out.println("====================================");
        phone3.getInfo();
        System.out.println("====================================");
        CellPhones phone4=new CellPhones("Samsung",5.8,"red",800,"Galaxy");
        phone4.getInfo();
        CellPhones[] phones={phone1,phone2,phone3,phone4};
        //brand of phone3;
        System.out.println(phones[2].brand);
        //get info of phone 3 from the array
        phones[2].getInfo();
        System.out.println("====================================");

        for (int i=0;i<phones.length;i++){
            phones[i].getInfo();
        }


    }
}
