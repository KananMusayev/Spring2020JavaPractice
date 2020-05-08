package Day34Class_ObjectContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setOfferinfo("Virginia","FanniMay",160000,true);
        Offer offer2=new Offer();
        offer2.setOfferinfo("Louisiana","IT technology",100000,true);
        Offer offer3=new Offer();
        offer3.setOfferinfo("Washington DC","Carmax",120000,false);
        Offer offer4=new Offer();
        offer4.setOfferinfo("Virginia","Cybertek",90000,true);
        Offer offer5=new Offer();
        offer5.setOfferinfo("Chikago","Capitol One",95000,false);

        ArrayList<Offer> offers=new ArrayList<>();
        offers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5));
        for (Offer eachoffer:offers){
            System.out.println(eachoffer);
        }

        offers.removeIf(p->p.isFullTime==false);
        offers.removeIf(p->!p.location.equalsIgnoreCase("Virginia"));
        offers.removeIf(p->p.salary<100000);
        System.out.println("===========================");
        System.out.println(offers);


    }
}
