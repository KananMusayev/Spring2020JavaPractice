package Day47AbstractionInterface;

public class PhoneObject {

    public static void main(String[] args) {

        Iphone iphone1=new Iphone("X",1000,"10 inches");
        System.out.println(iphone1);
        Iphone iphone2=new Iphone("8",900,"8 inches");
        System.out.println(iphone2);
        iphone1.calling(56476576);
        Samsung samsung1=new Samsung("Galaxy",1200,"7 inches");
        System.out.println(samsung1);
        samsung1.texting(56546);
    }

}
