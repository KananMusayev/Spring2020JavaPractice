package Day45Exceptions;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println("Java");
        waits(5);
        System.out.println("Cybertek");
    }

    public static void waits(double seconds){

        try {
            Thread.sleep((long)seconds*1000);
        }
        catch (Exception e) {


        }
        }
}
