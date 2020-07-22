package Day53Maps;

public class Garbage_Collection {


    public static void main(String[] args) {
        Garbage_Collection obj =new Garbage_Collection();// will not be collected by garbage collector
        new Garbage_Collection(); // will be collected by garbage collector


        System.out.println("Done");

        // unreference an object:

        String str = new String("Cybertek");
        str = new String("MIT");

        System.out.println(str);


        Integer num = new Integer(123);
        num =  new Integer(124);

        //123 will be collected by garbage collector

        Double n = new Double(0.5);
        n = null;

        System.out.println(n);


        Garbage_Collection obj3 = new Garbage_Collection();
        //   obj3.finalize();





    }
}
