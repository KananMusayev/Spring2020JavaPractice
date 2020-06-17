package Day48PolymorphismIntro;

public class PhoneObeject {

    public static void main(String[] args) {
        Iphone phone1=new Iphone(" 11 Pro",1000,"10 inches");
        System.out.println(phone1);
        phone1.calling(36546);
        phone1.facetiming(465464);
        phone1.texting(42535);
        phone1.download();
        Nokia nokia=new Nokia("T 28",200,"5 inches");
        System.out.println("====================");
        nokia.breakTheFloor();
        nokia.download();
        nokia.texting(454353);
        nokia.calling(42525);


    }
}
