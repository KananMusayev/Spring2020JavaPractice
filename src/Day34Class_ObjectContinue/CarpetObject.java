package Day34Class_ObjectContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet();

        Carpet[] list={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
        list[0].customOrder(7,8.5,20,true);
        list[1].customOrder(10,15,30,false);
        list[2].customOrder(9,20,15,true);
        list[3].customOrder(20,18,25,false);
        list[4].customOrder(35,45,35,true);


        ArrayList<Carpet> persianCarpets=new ArrayList<>();

        for (int i=0;i<list.length;i++) {
            if (list[i].isPersian) {
                persianCarpets.add(list[i]);
            }
            //else {regularCarpets.add(list[i]);}  bunude elemek olardi

        }
        System.out.println("There are "+persianCarpets.size()+" persian carpets");
        System.out.println(persianCarpets.get(0));
        System.out.println(persianCarpets.get(1).calccost());


        ArrayList<Carpet> regularCarpets=new ArrayList<>(Arrays.asList(list));

        regularCarpets.removeAll(persianCarpets);
        System.out.println(regularCarpets.get(1).calccost());
        System.out.println("===============");
        for (int i=0;i<regularCarpets.size();i++){
            System.out.println(regularCarpets.get(i).calccost());
        }
    }
}
